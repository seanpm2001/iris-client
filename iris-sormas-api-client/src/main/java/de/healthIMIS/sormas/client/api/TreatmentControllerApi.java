package de.healthIMIS.sormas.client.api;

import de.healthIMIS.sormas.client.invoker.ApiClient;

import de.healthIMIS.sormas.client.model.PushResult;
import de.healthIMIS.sormas.client.model.TreatmentDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
		date = "2021-01-28T10:11:24.562208+01:00[Europe/Berlin]")
@Component("de.healthIMIS.sormas.client.api.TreatmentControllerApi")
public class TreatmentControllerApi {
	private ApiClient apiClient;

	public TreatmentControllerApi() {
		this(new ApiClient());
	}

	@Autowired
	public TreatmentControllerApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * <p>
	 * <b>0</b> - default response
	 * 
	 * @return List&lt;String&gt;
	 * @throws RestClientException if an error occurs while attempting to invoke the API
	 */
	public List<String> getAllActiveUuids9() throws RestClientException {
		Object postBody = null;
		String path = UriComponentsBuilder.fromPath("/treatments/uuids").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "application/json; charset&#x3D;UTF-8" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = {};
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] { "basicAuth" };

		ParameterizedTypeReference<List<String>> returnType = new ParameterizedTypeReference<List<String>>() {};
		return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * <p>
	 * <b>0</b> - default response
	 * 
	 * @param since The since parameter
	 * @return List&lt;TreatmentDto&gt;
	 * @throws RestClientException if an error occurs while attempting to invoke the API
	 */
	public List<TreatmentDto> getAllTreatments(Long since) throws RestClientException {
		Object postBody = null;
		// verify the required parameter 'since' is set
		if (since == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'since' when calling getAllTreatments");
		}
		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("since", since);
		String path = UriComponentsBuilder.fromPath("/treatments/all/{since}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "application/json; charset&#x3D;UTF-8" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = {};
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] { "basicAuth" };

		ParameterizedTypeReference<List<TreatmentDto>> returnType = new ParameterizedTypeReference<List<TreatmentDto>>() {};
		return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * <p>
	 * <b>0</b> - default response
	 * 
	 * @param body The body parameter
	 * @return List&lt;TreatmentDto&gt;
	 * @throws RestClientException if an error occurs while attempting to invoke the API
	 */
	public List<TreatmentDto> getByUuids24(List<String> body) throws RestClientException {
		Object postBody = body;
		String path = UriComponentsBuilder.fromPath("/treatments/query").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "application/json; charset&#x3D;UTF-8" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json; charset&#x3D;UTF-8" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] { "basicAuth" };

		ParameterizedTypeReference<List<TreatmentDto>> returnType = new ParameterizedTypeReference<List<TreatmentDto>>() {};
		return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * <p>
	 * <b>0</b> - default response
	 * 
	 * @param body The body parameter
	 * @return List&lt;PushResult&gt;
	 * @throws RestClientException if an error occurs while attempting to invoke the API
	 */
	public List<PushResult> postTreatments(List<TreatmentDto> body) throws RestClientException {
		Object postBody = body;
		String path = UriComponentsBuilder.fromPath("/treatments/push").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "application/json; charset&#x3D;UTF-8" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json; charset&#x3D;UTF-8" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] { "basicAuth" };

		ParameterizedTypeReference<List<PushResult>> returnType = new ParameterizedTypeReference<List<PushResult>>() {};
		return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}
}
