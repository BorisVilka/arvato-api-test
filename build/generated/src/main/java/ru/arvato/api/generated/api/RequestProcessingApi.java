package ru.arvato.api.generated.api;

import ru.arvato.api.generated.ApiClient;

import ru.arvato.api.generated.model.Claims;
import ru.arvato.api.generated.model.Movements;
import ru.arvato.api.generated.model.OrderSent;
import ru.arvato.api.generated.model.OrderState;
import ru.arvato.api.generated.model.Payments;
import ru.arvato.api.generated.model.ProductOutgoConfirmation;
import ru.arvato.api.generated.model.ProductReceiveConfirmation;
import ru.arvato.api.generated.model.Refunds;
import ru.arvato.api.generated.model.Returns;
import ru.arvato.api.generated.model.Stockstate;

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
public class RequestProcessingApi {
    private ApiClient apiClient;

    public RequestProcessingApi() {
        this(new ApiClient());
    }

    @Autowired
    public RequestProcessingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Claims data
     * Claims data
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return Claims
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getClaimsRequestCreation(String ticket) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'ticket' is set
        if (ticket == null) {
            throw new RestClientResponseException("Missing the required parameter 'ticket' when calling getClaims", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("ticket", ticket);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/xml", "application/json", "plain/text"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwt" };

        ParameterizedTypeReference<Claims> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/response/claims/{ticket}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Claims data
     * Claims data
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return Claims
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Claims getClaims(String ticket) throws RestClientResponseException {
        ParameterizedTypeReference<Claims> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getClaimsRequestCreation(ticket).body(localVarReturnType);
    }

    /**
     * Claims data
     * Claims data
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return ResponseEntity&lt;Claims&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Claims> getClaimsWithHttpInfo(String ticket) throws RestClientResponseException {
        ParameterizedTypeReference<Claims> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getClaimsRequestCreation(ticket).toEntity(localVarReturnType);
    }

    /**
     * Claims data
     * Claims data
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getClaimsWithResponseSpec(String ticket) throws RestClientResponseException {
        return getClaimsRequestCreation(ticket);
    }
    /**
     * Movements data
     * get movements data
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return Movements
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getMovementsRequestCreation(String ticket) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'ticket' is set
        if (ticket == null) {
            throw new RestClientResponseException("Missing the required parameter 'ticket' when calling getMovements", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("ticket", ticket);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/xml", "application/json", "plain/text"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwt" };

        ParameterizedTypeReference<Movements> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/response/movements/{ticket}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Movements data
     * get movements data
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return Movements
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Movements getMovements(String ticket) throws RestClientResponseException {
        ParameterizedTypeReference<Movements> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getMovementsRequestCreation(ticket).body(localVarReturnType);
    }

    /**
     * Movements data
     * get movements data
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return ResponseEntity&lt;Movements&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Movements> getMovementsWithHttpInfo(String ticket) throws RestClientResponseException {
        ParameterizedTypeReference<Movements> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getMovementsRequestCreation(ticket).toEntity(localVarReturnType);
    }

    /**
     * Movements data
     * get movements data
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getMovementsWithResponseSpec(String ticket) throws RestClientResponseException {
        return getMovementsRequestCreation(ticket);
    }
    /**
     * Order sent
     * orders sent
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return OrderSent
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getOrderSentRequestCreation(String ticket) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'ticket' is set
        if (ticket == null) {
            throw new RestClientResponseException("Missing the required parameter 'ticket' when calling getOrderSent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("ticket", ticket);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/xml", "application/json", "plain/text"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwt" };

        ParameterizedTypeReference<OrderSent> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/response/ordersent/{ticket}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Order sent
     * orders sent
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return OrderSent
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public OrderSent getOrderSent(String ticket) throws RestClientResponseException {
        ParameterizedTypeReference<OrderSent> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getOrderSentRequestCreation(ticket).body(localVarReturnType);
    }

    /**
     * Order sent
     * orders sent
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return ResponseEntity&lt;OrderSent&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OrderSent> getOrderSentWithHttpInfo(String ticket) throws RestClientResponseException {
        ParameterizedTypeReference<OrderSent> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getOrderSentRequestCreation(ticket).toEntity(localVarReturnType);
    }

    /**
     * Order sent
     * orders sent
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getOrderSentWithResponseSpec(String ticket) throws RestClientResponseException {
        return getOrderSentRequestCreation(ticket);
    }
    /**
     * Current order state
     * get order state
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return OrderState
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getOrderStateRequestCreation(String ticket) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'ticket' is set
        if (ticket == null) {
            throw new RestClientResponseException("Missing the required parameter 'ticket' when calling getOrderState", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("ticket", ticket);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/xml", "application/json", "plain/text"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwt" };

        ParameterizedTypeReference<OrderState> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/response/orderstate/{ticket}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Current order state
     * get order state
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return OrderState
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public OrderState getOrderState(String ticket) throws RestClientResponseException {
        ParameterizedTypeReference<OrderState> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getOrderStateRequestCreation(ticket).body(localVarReturnType);
    }

    /**
     * Current order state
     * get order state
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return ResponseEntity&lt;OrderState&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OrderState> getOrderStateWithHttpInfo(String ticket) throws RestClientResponseException {
        ParameterizedTypeReference<OrderState> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getOrderStateRequestCreation(ticket).toEntity(localVarReturnType);
    }

    /**
     * Current order state
     * get order state
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getOrderStateWithResponseSpec(String ticket) throws RestClientResponseException {
        return getOrderStateRequestCreation(ticket);
    }
    /**
     * Product outgo confirmation response
     * get outgo confirmation data by request ident
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return ProductOutgoConfirmation
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getOutgoConfirmationRequestCreation(String ticket) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'ticket' is set
        if (ticket == null) {
            throw new RestClientResponseException("Missing the required parameter 'ticket' when calling getOutgoConfirmation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("ticket", ticket);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/xml", "application/json", "plain/text"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwt" };

        ParameterizedTypeReference<ProductOutgoConfirmation> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/response/product-outgo-confirmation/{ticket}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Product outgo confirmation response
     * get outgo confirmation data by request ident
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return ProductOutgoConfirmation
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ProductOutgoConfirmation getOutgoConfirmation(String ticket) throws RestClientResponseException {
        ParameterizedTypeReference<ProductOutgoConfirmation> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getOutgoConfirmationRequestCreation(ticket).body(localVarReturnType);
    }

    /**
     * Product outgo confirmation response
     * get outgo confirmation data by request ident
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return ResponseEntity&lt;ProductOutgoConfirmation&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProductOutgoConfirmation> getOutgoConfirmationWithHttpInfo(String ticket) throws RestClientResponseException {
        ParameterizedTypeReference<ProductOutgoConfirmation> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getOutgoConfirmationRequestCreation(ticket).toEntity(localVarReturnType);
    }

    /**
     * Product outgo confirmation response
     * get outgo confirmation data by request ident
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getOutgoConfirmationWithResponseSpec(String ticket) throws RestClientResponseException {
        return getOutgoConfirmationRequestCreation(ticket);
    }
    /**
     * Payments data
     * Payments data
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return Payments
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPaymentsRequestCreation(String ticket) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'ticket' is set
        if (ticket == null) {
            throw new RestClientResponseException("Missing the required parameter 'ticket' when calling getPayments", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("ticket", ticket);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/xml", "application/json", "plain/text"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwt" };

        ParameterizedTypeReference<Payments> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/response/payments/{ticket}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Payments data
     * Payments data
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return Payments
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Payments getPayments(String ticket) throws RestClientResponseException {
        ParameterizedTypeReference<Payments> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getPaymentsRequestCreation(ticket).body(localVarReturnType);
    }

    /**
     * Payments data
     * Payments data
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return ResponseEntity&lt;Payments&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Payments> getPaymentsWithHttpInfo(String ticket) throws RestClientResponseException {
        ParameterizedTypeReference<Payments> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getPaymentsRequestCreation(ticket).toEntity(localVarReturnType);
    }

    /**
     * Payments data
     * Payments data
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPaymentsWithResponseSpec(String ticket) throws RestClientResponseException {
        return getPaymentsRequestCreation(ticket);
    }
    /**
     * Product receive confirmation response
     * get receiving confirmation data by request ident
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return ProductReceiveConfirmation
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getReceiveConfirmationRequestCreation(String ticket) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'ticket' is set
        if (ticket == null) {
            throw new RestClientResponseException("Missing the required parameter 'ticket' when calling getReceiveConfirmation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("ticket", ticket);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/xml", "application/json", "plain/text"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwt" };

        ParameterizedTypeReference<ProductReceiveConfirmation> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/response/product-receive-confirmation/{ticket}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Product receive confirmation response
     * get receiving confirmation data by request ident
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return ProductReceiveConfirmation
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ProductReceiveConfirmation getReceiveConfirmation(String ticket) throws RestClientResponseException {
        ParameterizedTypeReference<ProductReceiveConfirmation> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getReceiveConfirmationRequestCreation(ticket).body(localVarReturnType);
    }

    /**
     * Product receive confirmation response
     * get receiving confirmation data by request ident
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return ResponseEntity&lt;ProductReceiveConfirmation&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProductReceiveConfirmation> getReceiveConfirmationWithHttpInfo(String ticket) throws RestClientResponseException {
        ParameterizedTypeReference<ProductReceiveConfirmation> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getReceiveConfirmationRequestCreation(ticket).toEntity(localVarReturnType);
    }

    /**
     * Product receive confirmation response
     * get receiving confirmation data by request ident
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getReceiveConfirmationWithResponseSpec(String ticket) throws RestClientResponseException {
        return getReceiveConfirmationRequestCreation(ticket);
    }
    /**
     * Refunds data
     * Refunds data
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return Refunds
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRefundsRequestCreation(String ticket) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'ticket' is set
        if (ticket == null) {
            throw new RestClientResponseException("Missing the required parameter 'ticket' when calling getRefunds", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("ticket", ticket);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/xml", "application/json", "plain/text"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwt" };

        ParameterizedTypeReference<Refunds> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/response/refunds/{ticket}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Refunds data
     * Refunds data
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return Refunds
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Refunds getRefunds(String ticket) throws RestClientResponseException {
        ParameterizedTypeReference<Refunds> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRefundsRequestCreation(ticket).body(localVarReturnType);
    }

    /**
     * Refunds data
     * Refunds data
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return ResponseEntity&lt;Refunds&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Refunds> getRefundsWithHttpInfo(String ticket) throws RestClientResponseException {
        ParameterizedTypeReference<Refunds> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRefundsRequestCreation(ticket).toEntity(localVarReturnType);
    }

    /**
     * Refunds data
     * Refunds data
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRefundsWithResponseSpec(String ticket) throws RestClientResponseException {
        return getRefundsRequestCreation(ticket);
    }
    /**
     * Returns data
     * Returns data
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return Returns
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getReturnsRequestCreation(String ticket) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'ticket' is set
        if (ticket == null) {
            throw new RestClientResponseException("Missing the required parameter 'ticket' when calling getReturns", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("ticket", ticket);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/xml", "application/json", "plain/text"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwt" };

        ParameterizedTypeReference<Returns> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/response/returns/{ticket}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returns data
     * Returns data
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return Returns
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Returns getReturns(String ticket) throws RestClientResponseException {
        ParameterizedTypeReference<Returns> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getReturnsRequestCreation(ticket).body(localVarReturnType);
    }

    /**
     * Returns data
     * Returns data
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return ResponseEntity&lt;Returns&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Returns> getReturnsWithHttpInfo(String ticket) throws RestClientResponseException {
        ParameterizedTypeReference<Returns> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getReturnsRequestCreation(ticket).toEntity(localVarReturnType);
    }

    /**
     * Returns data
     * Returns data
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getReturnsWithResponseSpec(String ticket) throws RestClientResponseException {
        return getReturnsRequestCreation(ticket);
    }
    /**
     * Stockstate response
     * get stockstate data by request ident
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return Stockstate
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getStockstateRequestCreation(String ticket) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'ticket' is set
        if (ticket == null) {
            throw new RestClientResponseException("Missing the required parameter 'ticket' when calling getStockstate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("ticket", ticket);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/xml", "application/json", "plain/text"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwt" };

        ParameterizedTypeReference<Stockstate> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/response/stockstate/{ticket}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Stockstate response
     * get stockstate data by request ident
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return Stockstate
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Stockstate getStockstate(String ticket) throws RestClientResponseException {
        ParameterizedTypeReference<Stockstate> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getStockstateRequestCreation(ticket).body(localVarReturnType);
    }

    /**
     * Stockstate response
     * get stockstate data by request ident
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return ResponseEntity&lt;Stockstate&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Stockstate> getStockstateWithHttpInfo(String ticket) throws RestClientResponseException {
        ParameterizedTypeReference<Stockstate> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getStockstateRequestCreation(ticket).toEntity(localVarReturnType);
    }

    /**
     * Stockstate response
     * get stockstate data by request ident
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param ticket The ticket parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getStockstateWithResponseSpec(String ticket) throws RestClientResponseException {
        return getStockstateRequestCreation(ticket);
    }
    /**
     * Check if the answer is ready
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param type The type parameter
     * @param ticket request number
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec responseTypeTicketHeadRequestCreation(String type, String ticket) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new RestClientResponseException("Missing the required parameter 'type' when calling responseTypeTicketHead", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'ticket' is set
        if (ticket == null) {
            throw new RestClientResponseException("Missing the required parameter 'ticket' when calling responseTypeTicketHead", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("type", type);
        pathParams.put("ticket", ticket);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwt" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/response/{type}/{ticket}", HttpMethod.HEAD, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Check if the answer is ready
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param type The type parameter
     * @param ticket request number
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void responseTypeTicketHead(String type, String ticket) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        responseTypeTicketHeadRequestCreation(type, ticket).body(localVarReturnType);
    }

    /**
     * Check if the answer is ready
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param type The type parameter
     * @param ticket request number
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> responseTypeTicketHeadWithHttpInfo(String type, String ticket) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return responseTypeTicketHeadRequestCreation(type, ticket).toEntity(localVarReturnType);
    }

    /**
     * Check if the answer is ready
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>425</b> - Too Early
     * <p><b>500</b> - Internal Server Error
     * @param type The type parameter
     * @param ticket request number
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec responseTypeTicketHeadWithResponseSpec(String type, String ticket) throws RestClientResponseException {
        return responseTypeTicketHeadRequestCreation(type, ticket);
    }
}
