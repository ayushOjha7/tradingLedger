package io.ayush.entity;

import java.sql.Date;

public class Transaction {

	private Integer trx_id;
	private Integer quantity;
	private Double sell_amount;
	private Double rate;
	private Double buy_amount;
	private Double broker_charges;
	private Double profit;
	private Double opening_balance;
	private Date date;

	public Transaction() {
		super();
	}

	public Transaction(Integer trx_id, Integer quantity, Double sell_amount, Double rate, Double buy_amount,
			Double broker_charges, Double profit, Double opening_balance, Date date) {
		super();
		this.trx_id = trx_id;
		this.quantity = quantity;
		this.sell_amount = sell_amount;
		this.rate = rate;
		this.buy_amount = buy_amount;
		this.broker_charges = broker_charges;
		this.profit = profit;
		this.opening_balance = opening_balance;
		this.date = date;
	}

	public Integer getTrx_id() {
		return trx_id;
	}

	public void setTrx_id(Integer trx_id) {
		this.trx_id = trx_id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getSell_amount() {
		return sell_amount;
	}

	public void setSell_amount(Double sell_amount) {
		this.sell_amount = sell_amount;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Double getBuy_amount() {
		return buy_amount;
	}

	public void setBuy_amount(Double buy_amount) {
		this.buy_amount = buy_amount;
	}

	public Double getBroker_charges() {
		return broker_charges;
	}

	public void setBroker_charges(Double broker_charges) {
		this.broker_charges = broker_charges;
	}

	public Double getProfit() {
		return profit;
	}

	public void setProfit(Double profit) {
		this.profit = profit;
	}

	public Double getOpening_balance() {
		return opening_balance;
	}

	public void setOpening_balance(Double opening_balance) {
		this.opening_balance = opening_balance;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
