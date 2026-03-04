package ru.arvato.api.generated.api;

import ru.arvato.api.generated.ApiClient;

import ru.arvato.api.generated.model.Dictionaries;
import ru.arvato.api.generated.model.Dictionary;

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
public class DictionariesApi {
    private ApiClient apiClient;

    public DictionariesApi() {
        this(new ApiClient());
    }

    @Autowired
    public DictionariesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Dictionary data
     * get dictionary data
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * @param dictionary The dictionary parameter
     * @return Dictionary
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec dictionaryRequestCreation(Dictionaries dictionary) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'dictionary' is set
        if (dictionary == null) {
            throw new RestClientResponseException("Missing the required parameter 'dictionary' when calling dictionary", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dictionary", dictionary));
        
        final String[] localVarAccepts = { 
            "application/xml", "application/json", "*/*", "plain/text"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwt" };

        ParameterizedTypeReference<Dictionary> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/dictionary", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Dictionary data
     * get dictionary data
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * @param dictionary The dictionary parameter
     * @return Dictionary
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Dictionary dictionary(Dictionaries dictionary) throws RestClientResponseException {
        ParameterizedTypeReference<Dictionary> localVarReturnType = new ParameterizedTypeReference<>() {};
        return dictionaryRequestCreation(dictionary).body(localVarReturnType);
    }

    /**
     * Dictionary data
     * get dictionary data
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * @param dictionary The dictionary parameter
     * @return ResponseEntity&lt;Dictionary&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Dictionary> dictionaryWithHttpInfo(Dictionaries dictionary) throws RestClientResponseException {
        ParameterizedTypeReference<Dictionary> localVarReturnType = new ParameterizedTypeReference<>() {};
        return dictionaryRequestCreation(dictionary).toEntity(localVarReturnType);
    }

    /**
     * Dictionary data
     * get dictionary data
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * @param dictionary The dictionary parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec dictionaryWithResponseSpec(Dictionaries dictionary) throws RestClientResponseException {
        return dictionaryRequestCreation(dictionary);
    }
}
