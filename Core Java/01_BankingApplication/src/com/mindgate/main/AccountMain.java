package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountMain 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World ");
		
		Account account = new Account(); // Account class dusre package ma hai isilie import kia hai
		
		account.setAccountNumber(101);
		account.setName("Kunal Aakre");
		account.setBalance(25000);
		
		System.out.println(account.getAccountNumber());
		System.out.println(account.getName());
		System.out.println(account.getBalance());
		
		
		System.out.println("---------------------------------");

		// alternate way optimised 1
		
		Account account2 = new Account(102, "Gauri Aakre", 30000);
		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getName());
		System.out.println(account2.getBalance());
		
		System.out.println("-----------------------------------");
		System.out.println(account2);
		
	}
}
