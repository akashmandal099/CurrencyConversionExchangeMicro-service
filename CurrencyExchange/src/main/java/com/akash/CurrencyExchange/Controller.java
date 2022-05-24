package com.akash.CurrencyExchange;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
	
	@GetMapping("/currency-exchange/{from}/{to}/{quantity}")
	public Exchange getExchange(
			@PathVariable("from") String currencyFrom,
			@PathVariable("to") String currencyTo,
			@PathVariable("quantity") int quantity) {
		
		
		HashMap<String, String> uriMap = new HashMap<>();
		uriMap.put("from", currencyFrom);
		uriMap.put("to", currencyTo);
		ResponseEntity<Exchange> entity = new RestTemplate().getForEntity("http://localhost:8000/currency-convert/{from}/{to}", Exchange.class, uriMap);
		Exchange body = entity.getBody();
		int currencyRate = body.getCurrencyRate();
		
		return new Exchange(1, currencyFrom, currencyTo, currencyRate, quantity, currencyRate*quantity);
	}
	
	@Autowired
	private ConvertProxy proxy;
	
	@GetMapping("/currency-exchange-feign/{from}/{to}/{quantity}")
	public Exchange getExchangeFeign(
			@PathVariable("from") String currencyFrom,
			@PathVariable("to") String currencyTo,
			@PathVariable("quantity") int quantity) {
		
		
		Exchange exchange = proxy.currencyConvertion(currencyFrom, currencyTo);
		
		return new Exchange(exchange.getId(), currencyFrom, currencyTo, 
				exchange.getCurrencyRate(), quantity, quantity*exchange.getCurrencyRate());
	}

}
