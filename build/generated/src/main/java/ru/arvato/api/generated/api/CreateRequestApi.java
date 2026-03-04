package ru.arvato.api.generated.api;

import ru.arvato.api.generated.ApiClient;

import java.time.OffsetDateTime;
import ru.arvato.api.generated.model.SalesChannel;
import ru.arvato.api.generated.model.Services;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestClient.ResponseSpec;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-03-04T15:59:00.699066900+03:00[Europe/Moscow]", comments = "Generator version: 7.7.0")
public class CreateRequestApi {
    private ApiClient apiClient;

    public CreateRequestApi() {
        this(new ApiClient());
    }

    @Autowired
    public CreateRequestApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Service request
     * Push request and get ident
     * <p><b>200</b> - url to get a response
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * @param service Type of data to export
     * @param feedbackUrl Optional URL to send response
     * @param dateFrom Period start date in yyyy-MM-dd&#39;T&#39;HH:mm:ss format (or short yyyy-MM-dd to API requests)
     * @param dateTo Period finish date in yyyy-MM-dd&#39;T&#39;HH:mm:ss format (or short yyyy-MM-dd to API requests)
     * @param invoiceNr Invoice number for PRODUCT_RECEIVE_CONFIRMATION, MOVEMENTS, PRODUCT_OUTGO_CONFIRMATION requests
     * @param orderNr Customer order number
     * @param salesChannel Sales channel (site or marketplace name) for STOCKSTATE_CHANNEL, ORDERSTATE requests
     * @return String
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec pushRequestRequestCreation(Services service, String feedbackUrl, OffsetDateTime dateFrom, OffsetDateTime dateTo, String invoiceNr, String orderNr, SalesChannel salesChannel) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'service' is set
        if (service == null) {
            throw new RestClientResponseException("Missing the required parameter 'service' when calling pushRequest", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "service", service));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "feedback-url", feedbackUrl));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date-from", dateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date-to", dateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "invoice-nr", invoiceNr));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "order-nr", orderNr));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sales-channel", salesChannel));
        
        final String[] localVarAccepts = { 
            "plain/text", "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwt" };

        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/request", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Service request
     * Push request and get ident
     * <p><b>200</b> - url to get a response
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * @param service Type of data to export
     * @param feedbackUrl Optional URL to send response
     * @param dateFrom Period start date in yyyy-MM-dd&#39;T&#39;HH:mm:ss format (or short yyyy-MM-dd to API requests)
     * @param dateTo Period finish date in yyyy-MM-dd&#39;T&#39;HH:mm:ss format (or short yyyy-MM-dd to API requests)
     * @param invoiceNr Invoice number for PRODUCT_RECEIVE_CONFIRMATION, MOVEMENTS, PRODUCT_OUTGO_CONFIRMATION requests
     * @param orderNr Customer order number
     * @param salesChannel Sales channel (site or marketplace name) for STOCKSTATE_CHANNEL, ORDERSTATE requests
     * @return String
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public String pushRequest(Services service, String feedbackUrl, OffsetDateTime dateFrom, OffsetDateTime dateTo, String invoiceNr, String orderNr, SalesChannel salesChannel) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return pushRequestRequestCreation(service, feedbackUrl, dateFrom, dateTo, invoiceNr, orderNr, salesChannel).body(localVarReturnType);
    }

    /**
     * Service request
     * Push request and get ident
     * <p><b>200</b> - url to get a response
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * @param service Type of data to export
     * @param feedbackUrl Optional URL to send response
     * @param dateFrom Period start date in yyyy-MM-dd&#39;T&#39;HH:mm:ss format (or short yyyy-MM-dd to API requests)
     * @param dateTo Period finish date in yyyy-MM-dd&#39;T&#39;HH:mm:ss format (or short yyyy-MM-dd to API requests)
     * @param invoiceNr Invoice number for PRODUCT_RECEIVE_CONFIRMATION, MOVEMENTS, PRODUCT_OUTGO_CONFIRMATION requests
     * @param orderNr Customer order number
     * @param salesChannel Sales channel (site or marketplace name) for STOCKSTATE_CHANNEL, ORDERSTATE requests
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> pushRequestWithHttpInfo(Services service, String feedbackUrl, OffsetDateTime dateFrom, OffsetDateTime dateTo, String invoiceNr, String orderNr, SalesChannel salesChannel) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return pushRequestRequestCreation(service, feedbackUrl, dateFrom, dateTo, invoiceNr, orderNr, salesChannel).toEntity(localVarReturnType);
    }

    /**
     * Service request
     * Push request and get ident
     * <p><b>200</b> - url to get a response
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * @param service Type of data to export
     * @param feedbackUrl Optional URL to send response
     * @param dateFrom Period start date in yyyy-MM-dd&#39;T&#39;HH:mm:ss format (or short yyyy-MM-dd to API requests)
     * @param dateTo Period finish date in yyyy-MM-dd&#39;T&#39;HH:mm:ss format (or short yyyy-MM-dd to API requests)
     * @param invoiceNr Invoice number for PRODUCT_RECEIVE_CONFIRMATION, MOVEMENTS, PRODUCT_OUTGO_CONFIRMATION requests
     * @param orderNr Customer order number
     * @param salesChannel Sales channel (site or marketplace name) for STOCKSTATE_CHANNEL, ORDERSTATE requests
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec pushRequestWithResponseSpec(Services service, String feedbackUrl, OffsetDateTime dateFrom, OffsetDateTime dateTo, String invoiceNr, String orderNr, SalesChannel salesChannel) throws RestClientResponseException {
        return pushRequestRequestCreation(service, feedbackUrl, dateFrom, dateTo, invoiceNr, orderNr, salesChannel);
    }
}
