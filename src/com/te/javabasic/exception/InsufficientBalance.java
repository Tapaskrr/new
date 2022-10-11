package com.te.javabasic.exception;

public class InsufficientBalance extends RuntimeException {

	String msg;
	public InsufficientBalance(String msg) {
		super(msg);
		System.out.println("case3");
		
		
		
	}
	
//	@Override
//	public String getMessage() {
//		// TODO Auto-generated method stub
//		return this.msg;
//	}
}
