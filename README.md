# Arvato API Client (тестовое задание)

Gradle-проект на **Java 17** с **Spring Boot 3** и **OpenAPI Generator**. В процессе сборки генерируется Java-модель и API-клиент по спецификации Arvato.

## Требования

- JDK 17 (для сборки и тестов нужна корректная переменная **JAVA_HOME**; при ошибке `jvm.cfg` проверьте путь к JDK).
- Спецификация OpenAPI: [https://api-prod.arvato.ru/resources/openapi/openapi.json](https://api-prod.arvato.ru/resources/openapi/openapi.json) (локальная копия в `src/main/resources/openapi/openapi.json`)

## Сборка и генерация

При сборке автоматически запускается задача `openApiGenerate`: по спецификации генерируются Java-модели и API-интерфейсы в `build/generated/` (пакеты `ru.arvato.api.generated.api`, `ru.arvato.api.generated.model`).

```bash
# Сборка (включает генерацию и компиляцию)
./gradlew build

# Только генерация по OpenAPI
./gradlew openApiGenerate
```

## Тесты (mock-окружение)

Реализованы успешные сценарии (ответ **200** и предусмотренный API ответ) в mock-окружении с использованием сгенерированных моделей:

1. **Авторизация (login)** — `POST /account/login`, проверка 200 и тела ответа (JWT).
2. **Регистрация тикета (pushRequest)** — `GET /request?service=stockstate&date-to=2025-12-31`, проверка 200 и идентификатора тикета.
3. **Получение данных по тикету (getStockstate)** — `GET /response/stockstate/{ticket}`, проверка 200 и модели `Stockstate` с полем `stock-item`.

Тесты используют **MockWebServer** (OkHttp): поднимается mock-сервер, в тестах выставляется `arvato.api.base-url` на его адрес, вызывается сервис и проверяются статус и тело ответа с помощью сгенерированных моделей.

```bash
./gradlew test
```

## Структура

- `src/main/java/ru/arvato/api/` — приложение Spring Boot, конфигурация клиента, сервис-обёртка над сгенерированным API.
- `src/main/resources/openapi/openapi.json` — спецификация OpenAPI (можно заменить на загрузку по URL в задаче `openApiGenerate`).
- `build/generated/` — сгенерированные API и модели (не коммитятся, создаются при сборке).
- `src/test/java/ru/arvato/api/service/ArvatoClientServiceTest.java` — тесты login, pushRequest, getStockstate в mock-окружении.

## Ссылки на API (из задания)

- Авторизация: [login](https://api-prod.arvato.ru/index.html#/login/login)
- Регистрация тикета: [pushRequest (service=stockstate, date-to=2025-12-31)](https://api-prod.arvato.ru/index.html#/create%20request/push/pushRequestservice=stockstate,%20date-to=2025-12-31)
- Получение данных по тикету: [getStockstate (stock-item)](https://api-prod.arvato.ru/index.html#/request%20processsing/getStockstate)
