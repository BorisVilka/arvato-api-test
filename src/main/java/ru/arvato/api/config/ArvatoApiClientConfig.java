package ru.arvato.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.arvato.api.generated.ApiClient;
import ru.arvato.api.generated.api.CreateRequestApi;
import ru.arvato.api.generated.api.LoginApi;
import ru.arvato.api.generated.api.RequestProcessingApi;

@Configuration
public class ArvatoApiClientConfig {

    @Value("${arvato.api.base-url:https://api-prod.arvato.ru}")
    private String baseUrl;

    @Bean
    public ApiClient arvatoApiClient() {
        ApiClient client = new ApiClient();
        client.setBasePath(baseUrl);
        return client;
    }

    @Bean
    public LoginApi loginApi(ApiClient arvatoApiClient) {
        return new LoginApi(arvatoApiClient);
    }

    @Bean
    public CreateRequestApi createRequestApi(ApiClient arvatoApiClient) {
        return new CreateRequestApi(arvatoApiClient);
    }

    @Bean
    public RequestProcessingApi requestProcessingApi(ApiClient arvatoApiClient) {
        return new RequestProcessingApi(arvatoApiClient);
    }
}
