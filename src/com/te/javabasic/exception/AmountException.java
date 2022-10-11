package com.te.javabasic.exception;

public class AmountException {

	public static void main(String[] args) {

		Amount amount = new Amount();
		amount.bankAccount(2000);

		try {
			Amount.withdraw(3000);
			//no execution further 
			System.out.println("case 1");
		} catch (InsufficientBalance e) {
			System.out.println("case 4");
			System.out.println(e.getMessage());
		}
	}

}
