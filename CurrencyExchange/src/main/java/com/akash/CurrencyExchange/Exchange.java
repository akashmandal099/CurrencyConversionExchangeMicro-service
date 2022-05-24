package com.akash.CurrencyExchange;


public class Exchange {
	
	private int id;
	private String currencyFrom;
	private String currencyTo;
	private int currencyRate;
	private int quantity;
	private int totalCalculatedAmount;
	
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}
	public void setTotalCalculatedAmount(int totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}
	
	public Exchange() {
		super();
	}
	
	public Exchange(int id, String currencyFrom, String currencyTo, int currencyRate, int quantity,
			int totalCalculatedAmount) {
		super();
		this.id = id;
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
		this.currencyRate = currencyRate;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
	}
	
	

}
