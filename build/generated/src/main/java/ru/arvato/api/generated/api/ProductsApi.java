package ru.arvato.api.generated.api;

import ru.arvato.api.generated.ApiClient;

import ru.arvato.api.generated.model.BrandList;
import ru.arvato.api.generated.model.ImportState;
import ru.arvato.api.generated.model.MoveProductRequest;
import ru.arvato.api.generated.model.ProductList;
import ru.arvato.api.generated.model.ProductReceiveList;

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
public class ProductsApi {
    private ApiClient apiClient;

    public ProductsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ProductsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Update product variants
     * Update product variants
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Unprocessable entity
     * @param productList The productList parameter
     * @return ImportState
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec importMatmasRequestCreation(ProductList productList) throws RestClientResponseException {
        Object postBody = productList;
        // verify the required parameter 'productList' is set
        if (productList == null) {
            throw new RestClientResponseException("Missing the required parameter 'productList' when calling importMatmas", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/xml", "application/json", "*/*", "plain/text"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml", "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwt" };

        ParameterizedTypeReference<ImportState> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/products/importProduct", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update product variants
     * Update product variants
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Unprocessable entity
     * @param productList The productList parameter
     * @return ImportState
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ImportState importMatmas(ProductList productList) throws RestClientResponseException {
        ParameterizedTypeReference<ImportState> localVarReturnType = new ParameterizedTypeReference<>() {};
        return importMatmasRequestCreation(productList).body(localVarReturnType);
    }

    /**
     * Update product variants
     * Update product variants
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Unprocessable entity
     * @param productList The productList parameter
     * @return ResponseEntity&lt;ImportState&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ImportState> importMatmasWithHttpInfo(ProductList productList) throws RestClientResponseException {
        ParameterizedTypeReference<ImportState> localVarReturnType = new ParameterizedTypeReference<>() {};
        return importMatmasRequestCreation(productList).toEntity(localVarReturnType);
    }

    /**
     * Update product variants
     * Update product variants
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Unprocessable entity
     * @param productList The productList parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec importMatmasWithResponseSpec(ProductList productList) throws RestClientResponseException {
        return importMatmasRequestCreation(productList);
    }
    /**
     * Import lots
     * import lots
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Unprocessable entity
     * @param brandList The brandList parameter
     * @return ImportState
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec importProductListRequestCreation(BrandList brandList) throws RestClientResponseException {
        Object postBody = brandList;
        // verify the required parameter 'brandList' is set
        if (brandList == null) {
            throw new RestClientResponseException("Missing the required parameter 'brandList' when calling importProductList", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/products/import", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Import lots
     * import lots
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Unprocessable entity
     * @param brandList The brandList parameter
     * @return ImportState
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ImportState importProductList(BrandList brandList) throws RestClientResponseException {
        ParameterizedTypeReference<ImportState> localVarReturnType = new ParameterizedTypeReference<>() {};
        return importProductListRequestCreation(brandList).body(localVarReturnType);
    }

    /**
     * Import lots
     * import lots
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Unprocessable entity
     * @param brandList The brandList parameter
     * @return ResponseEntity&lt;ImportState&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ImportState> importProductListWithHttpInfo(BrandList brandList) throws RestClientResponseException {
        ParameterizedTypeReference<ImportState> localVarReturnType = new ParameterizedTypeReference<>() {};
        return importProductListRequestCreation(brandList).toEntity(localVarReturnType);
    }

    /**
     * Import lots
     * import lots
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Unprocessable entity
     * @param brandList The brandList parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec importProductListWithResponseSpec(BrandList brandList) throws RestClientResponseException {
        return importProductListRequestCreation(brandList);
    }
    /**
     * Import Receiving
     * import receiving portions
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Unprocessable entity
     * @param productReceiveList The productReceiveList parameter
     * @return ImportState
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec importReceiveRequestCreation(ProductReceiveList productReceiveList) throws RestClientResponseException {
        Object postBody = productReceiveList;
        // verify the required parameter 'productReceiveList' is set
        if (productReceiveList == null) {
            throw new RestClientResponseException("Missing the required parameter 'productReceiveList' when calling importReceive", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/xml", "application/json", "*/*", "plain/text"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml", "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwt" };

        ParameterizedTypeReference<ImportState> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/products/importReceive", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Import Receiving
     * import receiving portions
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Unprocessable entity
     * @param productReceiveList The productReceiveList parameter
     * @return ImportState
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ImportState importReceive(ProductReceiveList productReceiveList) throws RestClientResponseException {
        ParameterizedTypeReference<ImportState> localVarReturnType = new ParameterizedTypeReference<>() {};
        return importReceiveRequestCreation(productReceiveList).body(localVarReturnType);
    }

    /**
     * Import Receiving
     * import receiving portions
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Unprocessable entity
     * @param productReceiveList The productReceiveList parameter
     * @return ResponseEntity&lt;ImportState&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ImportState> importReceiveWithHttpInfo(ProductReceiveList productReceiveList) throws RestClientResponseException {
        ParameterizedTypeReference<ImportState> localVarReturnType = new ParameterizedTypeReference<>() {};
        return importReceiveRequestCreation(productReceiveList).toEntity(localVarReturnType);
    }

    /**
     * Import Receiving
     * import receiving portions
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Unprocessable entity
     * @param productReceiveList The productReceiveList parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec importReceiveWithResponseSpec(ProductReceiveList productReceiveList) throws RestClientResponseException {
        return importReceiveRequestCreation(productReceiveList);
    }
    /**
     * Move products request
     * Move products request
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Unprocessable entity
     * @param moveProductRequest The moveProductRequest parameter
     * @return ImportState
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec moveReqtRequestCreation(MoveProductRequest moveProductRequest) throws RestClientResponseException {
        Object postBody = moveProductRequest;
        // verify the required parameter 'moveProductRequest' is set
        if (moveProductRequest == null) {
            throw new RestClientResponseException("Missing the required parameter 'moveProductRequest' when calling moveReqt", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/xml", "application/json", "*/*", "plain/text"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml", "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwt" };

        ParameterizedTypeReference<ImportState> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/products/moverequest", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Move products request
     * Move products request
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Unprocessable entity
     * @param moveProductRequest The moveProductRequest parameter
     * @return ImportState
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ImportState moveReqt(MoveProductRequest moveProductRequest) throws RestClientResponseException {
        ParameterizedTypeReference<ImportState> localVarReturnType = new ParameterizedTypeReference<>() {};
        return moveReqtRequestCreation(moveProductRequest).body(localVarReturnType);
    }

    /**
     * Move products request
     * Move products request
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Unprocessable entity
     * @param moveProductRequest The moveProductRequest parameter
     * @return ResponseEntity&lt;ImportState&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ImportState> moveReqtWithHttpInfo(MoveProductRequest moveProductRequest) throws RestClientResponseException {
        ParameterizedTypeReference<ImportState> localVarReturnType = new ParameterizedTypeReference<>() {};
        return moveReqtRequestCreation(moveProductRequest).toEntity(localVarReturnType);
    }

    /**
     * Move products request
     * Move products request
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Unprocessable entity
     * @param moveProductRequest The moveProductRequest parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec moveReqtWithResponseSpec(MoveProductRequest moveProductRequest) throws RestClientResponseException {
        return moveReqtRequestCreation(moveProductRequest);
    }
}
