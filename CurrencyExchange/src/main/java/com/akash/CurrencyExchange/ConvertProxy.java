package com.akash.CurrencyExchange;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.cloud.openfeign.FeignClient;

//@FeignClient(name = "currency-convert",url = "localhost:8000")
@FeignClient(name = "currency-convert")
public interface ConvertProxy {
	
	@GetMapping("/currency-convert/{from}/{to}")
	public Exchange currencyConvertion(
			@PathVariable("from") String currencyFrom, 
			@PathVariable("to") String currencyTo);

}
