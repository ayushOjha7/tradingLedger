package io.ayush.view;

import java.util.Scanner;

import io.ayush.controller.TransactionDetailsController;
import io.ayush.entity.Transaction;

public class UserInputs {

	Transaction transaction;
	Scanner scanner = new Scanner(System.in);
	TransactionDetailsController tdc;

	public void isFirstEntry() {

		System.out.println("Enter 1 for 1st transaction or press any key");
		int choice = scanner.nextInt();

		if (choice == 1) {
			getOpeningBalanceFromUser();
		} else
			getUserInputForTransaction();

	}

	private void getOpeningBalanceFromUser() {

		System.out.print("Enter your Opening Balance in Demat Account : ");
		Double openingBalance = scanner.nextDouble();
		tdc.setOpeningBalance(openingBalance);

	}

	private void getUserInputForTransaction() {
		char buy;
		
		System.out.print("Enter Quantity : ");
		transaction.setQuantity(scanner.nextInt());
		System.out.print("Enter rate : ");
		transaction.setRate(scanner.nextDouble());
		System.out.print("Enter B for Buy :");
		buy = scanner.next().charAt(0);
		
		tdc.setTransactionDetails(transaction, buy);
	}

}
