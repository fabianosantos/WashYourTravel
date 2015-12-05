package com.wyt.config;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

	@Value("${rest.service.connection.timeout}")
	private int connectionTimeout;

	@Value("${rest.service.read.timeout}")
	private int readTimeout;

	@Value("${rest.service.max.connection.per.host}")
	private int maxConnectionsPerHost;

	@Value("${rest.service.max.connection.total}")
	private int maxConnectionsTotal;

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate(getClientHttpRequestFactory());
	}

	private ClientHttpRequestFactory getClientHttpRequestFactory() {
		HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
		factory.setHttpClient(getHttpClient());
		factory.setConnectTimeout(connectionTimeout);
		factory.setReadTimeout(readTimeout);
		return factory;
	}

	private HttpClient getHttpClient() {
		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
		httpClientBuilder.setMaxConnPerRoute(maxConnectionsPerHost);
		httpClientBuilder.setMaxConnTotal(maxConnectionsTotal);
		return httpClientBuilder.build();
	}

}
