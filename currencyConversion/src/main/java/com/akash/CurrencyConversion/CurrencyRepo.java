package com.akash.CurrencyConversion;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepo extends JpaRepository<Currency, Integer> {
	Currency findAllByCurrencyFromAndCurrencyTo(String from, String to);
}
