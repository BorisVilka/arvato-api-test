package ru.arvato.api.generated.api;

import ru.arvato.api.generated.ApiClient;

import ru.arvato.api.generated.model.AccountCredentials;

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
public class LoginApi {
    private ApiClient apiClient;

    public LoginApi() {
        this(new ApiClient());
    }

    @Autowired
    public LoginApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Login
     * login
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * @param accountCredentials The accountCredentials parameter
     * @return String
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec loginRequestCreation(AccountCredentials accountCredentials) throws RestClientResponseException {
        Object postBody = accountCredentials;
        // verify the required parameter 'accountCredentials' is set
        if (accountCredentials == null) {
            throw new RestClientResponseException("Missing the required parameter 'accountCredentials' when calling login", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/account/login", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Login
     * login
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * @param accountCredentials The accountCredentials parameter
     * @return String
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public String login(AccountCredentials accountCredentials) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return loginRequestCreation(accountCredentials).body(localVarReturnType);
    }

    /**
     * Login
     * login
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * @param accountCredentials The accountCredentials parameter
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> loginWithHttpInfo(AccountCredentials accountCredentials) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return loginRequestCreation(accountCredentials).toEntity(localVarReturnType);
    }

    /**
     * Login
     * login
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * @param accountCredentials The accountCredentials parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec loginWithResponseSpec(AccountCredentials accountCredentials) throws RestClientResponseException {
        return loginRequestCreation(accountCredentials);
    }
}
