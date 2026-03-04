package ru.arvato.api.generated.api;

import ru.arvato.api.generated.ApiClient;

import ru.arvato.api.generated.model.ImportState;
import ru.arvato.api.generated.model.OrderList;

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
public class CustomerOrdersApi {
    private ApiClient apiClient;

    public CustomerOrdersApi() {
        this(new ApiClient());
    }

    @Autowired
    public CustomerOrdersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * Load purchase orders
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Unprocessable entity
     * @param orderList The orderList parameter
     * @return ImportState
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec importOrdersRequestCreation(OrderList orderList) throws RestClientResponseException {
        Object postBody = orderList;
        // verify the required parameter 'orderList' is set
        if (orderList == null) {
            throw new RestClientResponseException("Missing the required parameter 'orderList' when calling importOrders", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/xml", "*/*", "plain/text"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml", "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwt" };

        ParameterizedTypeReference<ImportState> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/order/import", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Load purchase orders
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Unprocessable entity
     * @param orderList The orderList parameter
     * @return ImportState
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ImportState importOrders(OrderList orderList) throws RestClientResponseException {
        ParameterizedTypeReference<ImportState> localVarReturnType = new ParameterizedTypeReference<>() {};
        return importOrdersRequestCreation(orderList).body(localVarReturnType);
    }

    /**
     * 
     * Load purchase orders
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Unprocessable entity
     * @param orderList The orderList parameter
     * @return ResponseEntity&lt;ImportState&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ImportState> importOrdersWithHttpInfo(OrderList orderList) throws RestClientResponseException {
        ParameterizedTypeReference<ImportState> localVarReturnType = new ParameterizedTypeReference<>() {};
        return importOrdersRequestCreation(orderList).toEntity(localVarReturnType);
    }

    /**
     * 
     * Load purchase orders
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Unprocessable entity
     * @param orderList The orderList parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec importOrdersWithResponseSpec(OrderList orderList) throws RestClientResponseException {
        return importOrdersRequestCreation(orderList);
    }
}
