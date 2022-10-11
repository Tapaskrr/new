package com.te.javabasic.exception;

public class Amount {

	double originalBalance;

	public static void withdraw(double amount) {
		Amount balance = new Amount();

		if (amount <= balance.originalBalance) {

			System.out.println("withdraw successfull");
		}

		else {
			System.out.println("case2");
			throw new InsufficientBalance("insufficient balance not possible");
			// no execution after this
		}
	}

	public void bankAccount(double amount) {

		this.originalBalance = amount;
	}

}
