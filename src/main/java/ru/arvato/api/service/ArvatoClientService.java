package ru.arvato.api.service;

import ru.arvato.api.generated.api.CreateRequestApi;
import ru.arvato.api.generated.api.LoginApi;
import ru.arvato.api.generated.api.RequestProcessingApi;
import ru.arvato.api.generated.model.AccountCredentials;
import ru.arvato.api.generated.model.Services;
import ru.arvato.api.generated.model.Stockstate;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * Сервис для работы с API Arvato: авторизация, регистрация тикета, получение данных по тикету.
 */
@Service
public class ArvatoClientService {

    private final LoginApi loginApi;
    private final CreateRequestApi createRequestApi;
    private final RequestProcessingApi requestProcessingApi;

    public ArvatoClientService(LoginApi loginApi,
                               CreateRequestApi createRequestApi,
                               RequestProcessingApi requestProcessingApi) {
        this.loginApi = loginApi;
        this.createRequestApi = createRequestApi;
        this.requestProcessingApi = requestProcessingApi;
    }

    /**
     * Авторизация (login).
     * @return JWT токен при успехе (ответ 200)
     */
    public String login(AccountCredentials credentials) {
        return loginApi.login(credentials);
    }

    /**
     * Регистрация тикета (pushRequest) для сервиса stockstate.
     * @param dateTo дата окончания периода в формате yyyy-MM-dd
     * @return идентификатор тикета / URL ответа при успехе (200)
     */
    public String pushRequestStockstate(String dateTo) {
        OffsetDateTime dateToParam = dateTo != null
                ? LocalDate.parse(dateTo).atStartOfDay(ZoneOffset.UTC).toOffsetDateTime()
                : null;
        return createRequestApi.pushRequest(
                Services.STOCKSTATE,
                null,
                null,
                dateToParam,
                null,
                null,
                null
        );
    }

    /**
     * Получение данных по тикету (getStockstate).
     * @param ticket идентификатор тикета
     * @return Stockstate с полем stock-item при успехе (200)
     */
    public Stockstate getStockstate(String ticket) {
        return requestProcessingApi.getStockstate(ticket);
    }
}
