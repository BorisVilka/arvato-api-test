package ru.arvato.api.service;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import ru.arvato.api.generated.model.AccountCredentials;
import ru.arvato.api.generated.model.Stockstate;
import ru.arvato.api.generated.model.StockItem;
import ru.arvato.api.generated.model.StockstateProduct;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тесты API в mock-окружении (MockWebServer): авторизация, регистрация тикета, получение данных по тикету.
 * Проверяются ответ 200 и предусмотренный API ответ с использованием сгенерированной модели.
 */
@SpringBootTest
class ArvatoClientServiceTest {

    static MockWebServer mockWebServer;

    @Autowired
    ArvatoClientService arvatoClientService;

    @org.junit.jupiter.api.BeforeAll
    static void startMockServer() throws IOException {
        mockWebServer = new MockWebServer();
        mockWebServer.start();
    }

    @org.junit.jupiter.api.AfterAll
    static void stopMockServer() throws IOException {
        if (mockWebServer != null) {
            mockWebServer.shutdown();
        }
    }

    @DynamicPropertySource
    static void overrideBaseUrl(DynamicPropertyRegistry registry) {
        registry.add("arvato.api.base-url", () -> mockWebServer.url("/").toString().replaceAll("/$", ""));
    }

    @Test
    @DisplayName("Login: ответ 200 и возвращается JWT (сгенерированная модель AccountCredentials -> String)")
    void login_returns200AndToken() throws Exception {
        String expectedToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.test";
        mockWebServer.enqueue(new MockResponse()
                .setResponseCode(200)
                .setBody(expectedToken)
                .addHeader("Content-Type", "application/json"));

        AccountCredentials credentials = new AccountCredentials();
        credentials.setUsername("sa_apitest");
        credentials.setPassword("Zuvo4715");

        String token = arvatoClientService.login(credentials);

        assertThat(token).isEqualTo(expectedToken);

        RecordedRequest request = mockWebServer.takeRequest();
        assertThat(request.getMethod()).isEqualTo("POST");
        assertThat(request.getPath()).isEqualTo("/account/login");
    }

    @Test
    @DisplayName("PushRequest (регистрация тикета stockstate, date-to=2025-12-31): ответ 200 и идентификатор тикета")
    void pushRequestStockstate_returns200AndTicketId() throws Exception {
        String expectedTicketId = "ticket-stockstate-12345";
        mockWebServer.enqueue(new MockResponse()
                .setResponseCode(200)
                .setBody(expectedTicketId)
                .addHeader("Content-Type", "text/plain"));

        String ticketId = arvatoClientService.pushRequestStockstate("2025-12-31");

        assertThat(ticketId).isEqualTo(expectedTicketId);

        RecordedRequest request = mockWebServer.takeRequest();
        assertThat(request.getMethod()).isEqualTo("GET");
        assertThat(request.getPath()).contains("/request");
        assert request.getRequestUrl() != null;
        assertThat(request.getRequestUrl().query()).contains("service=STOCKSTATE");
        assertThat(request.getRequestUrl().query()).contains("date-to=2025-12-31");
    }

    @Test
    @DisplayName("GetStockstate: ответ 200 и данные с полем stock-item (сгенерированная модель Stockstate)")
    void getStockstate_returns200AndStockstateWithStockItem() throws Exception {
        String ticket = "ticket-stockstate-12345";
        String jsonResponse = """
                {
                  "date": "2025-03-04T12:00:00.000Z",
                  "context": "=login",
                  "stock-item": [
                    {
                      "product": {
                        "nr": "D303",
                        "id": "1234567"
                      },
                      "warehouse": "MAIN STOCK",
                      "amount": 10
                    }
                  ]
                }
                """;
        mockWebServer.enqueue(new MockResponse()
                .setResponseCode(200)
                .setBody(jsonResponse)
                .addHeader("Content-Type", "application/json"));

        Stockstate stockstate = arvatoClientService.getStockstate(ticket);

        assertThat(stockstate).isNotNull();
        assertThat(stockstate.getDate()).isNotNull();
        assertThat(stockstate.getContext()).isEqualTo("=login");
        assertThat(stockstate.getStockItem()).isNotNull();
        assertThat(stockstate.getStockItem()).hasSize(1);

        StockItem item = stockstate.getStockItem().get(0);
        assertThat(item.getWarehouse()).isEqualTo("MAIN STOCK");
        assertThat(item.getAmount()).isEqualTo(10.0);
        assertThat(item.getProduct()).isNotNull();
        StockstateProduct product = item.getProduct();
        assertThat(product.getNr()).isEqualTo("D303");
        assertThat(product.getId()).isEqualTo("1234567");

        RecordedRequest request = mockWebServer.takeRequest();
        assertThat(request.getMethod()).isEqualTo("GET");
        assertThat(request.getPath()).isEqualTo("/response/stockstate/" + ticket);
    }
}
