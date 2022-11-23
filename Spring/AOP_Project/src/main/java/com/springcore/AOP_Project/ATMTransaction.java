package com.springcore.AOP_Project;

import org.springframework.stereotype.Component;

@Component
public class ATMTransaction {

	public void credit() {
		System.out.println("You credited some money");
	}
	public void debit()
	{
		System.out.println("You debited some money");
	}
}
