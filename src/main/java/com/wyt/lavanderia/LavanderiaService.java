package com.wyt.lavanderia;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LavanderiaService {
	
	private static final String PARAM = "/address/{address}/laundry";
	private static final String PARAM_BY_ID = "/laundry/{id}";

	@Autowired
	private RestTemplate restTemplate;
	
	@Value(value = "${google.map.laundry}")
	private String endpoint;

	public List<Lavanderia> list(String address) {
		// TODO Auto-generated method stub
		return Arrays.asList(restTemplate.getForObject(createURL(), Lavanderia[].class, address));
	}

	private String createURL() {
		// TODO Auto-generated method stub
		return endpoint + PARAM;
	}

	public Lavanderia getById(String lavanderia) {
		return restTemplate.getForObject(endpoint + PARAM_BY_ID, Lavanderia.class, lavanderia);
	}

}
