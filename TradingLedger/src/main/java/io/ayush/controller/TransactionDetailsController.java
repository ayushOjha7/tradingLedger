package io.ayush.controller;

import java.sql.Date;

import io.ayush.dao.TransactionDao;
import io.ayush.entity.Transaction;

public class TransactionDetailsController {

	private static Double securities_Transaction_Tax = 0.0625;
	private static Double stamp_Duty = 0.003;
	private static Double exchange_Transaction_Charge = 0.0005;
	private static Double sebi_Turnover_Charge = 0.0001;
	private static Double groww_Brokerage = 20D;

	Transaction transaction;
	TransactionDao dao;

	public void setOpeningBalance(Double openingBalance) {

		transaction.setOpening_balance(openingBalance);

		long millis = System.currentTimeMillis();
		Date date = new Date(millis);
		transaction.setDate(date);

		transaction.setBroker_charges(0D);
		transaction.setBuy_amount(0D);
		transaction.setProfit(0D);
		transaction.setQuantity(0);
		transaction.setRate(0D);
		transaction.setSell_amount(0D);
	}

	public void setTransactionDetails(Transaction transaction, char buy) {
		Double totalCharges;
		transaction.setOpening_balance(dao.getOB());

		long millis = System.currentTimeMillis();
		Date date = new Date(millis);
		transaction.setDate(date);

		double amount = transaction.getQuantity() * transaction.getRate();

		if (buy == 'b' || buy == 'B') {
			transaction.setBuy_amount(amount);
		} else {
			transaction.setSell_amount(amount);
		}

		Double total_exchange_Transaction_Charge = amount * exchange_Transaction_Charge;


		transaction.setBroker_charges(0D);

		transaction.setProfit(0D);

	}

}
