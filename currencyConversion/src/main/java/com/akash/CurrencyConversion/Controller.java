package com.akash.CurrencyConversion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	
	@Autowired
	CurrencyRepo repo;
	
	@GetMapping("/currency-convert/{from}/{to}")
	public Currency currencyConvertion(
			@PathVariable("from") String currencyFrom, 
			@PathVariable("to") String currencyTo) 
	{
		return repo.findAllByCurrencyFromAndCurrencyTo(currencyFrom, currencyTo);
	}
	
}
