package com.akash.CurrencyConversion;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Currency {
	
	@Id
	int id;
	String currencyFrom;
	String currencyTo;
	int currencyRate;
	
	public Currency() {
		super();
	}

	public Currency(int id, String currencyFrom, String currencyTo, int currencyRate) {
		super();
		this.id = id;
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
		this.currencyRate = currencyRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCurrencyFrom() {
		return currencyFrom;
	}

	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}

	public String getCurrencyTo() {
		return currencyTo;
	}

	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}

	public int getCurrencyRate() {
		return currencyRate;
	}

	public void setCurrencyRate(int currencyRate) {
		this.currencyRate = currencyRate;
	}

	
	
	

}
