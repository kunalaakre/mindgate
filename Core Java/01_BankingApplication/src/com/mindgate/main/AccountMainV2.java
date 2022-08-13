package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountMainV2 
{
	public static void main(String[] args) 
	{
		Account account = new Account(101,"Kunal Aakre",5000);
		
		System.out.println("Withdraw :: 500");
		
	//	boolean result = account.withdraw(1000);
		
		if(account.withdraw(1000))
		{
			System.out.println("Transaction Sucess!!!!!");
		}
		else
		{
			System.out.println("Transaction denied!!!!");
		}
		System.out.println(account.getBalance());
	}
}
