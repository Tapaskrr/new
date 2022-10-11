package com.te.javabasic.voting;

public class Vote {
	
	int age=18;

	public void vote(int age) throws AgeException {
		if (age<=this.age) {
			System.out.println("good , you are eligible");
		}
		else {
			throw new AgeException("you are not eligible");
		}
	}

}
