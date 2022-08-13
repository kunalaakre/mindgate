package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.Savings;

public class AccountMainV4 
{
	public static void main(String[] args)
	{
		int accountNumber;
		String name;
		double balance;
		int press;
		boolean result;
		double amount;
		String chooice;
		boolean isSalary;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your account number");
		 accountNumber = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("enter your name");
		 name = scanner.nextLine();
		
		System.out.println("enter your balance");
		 balance = scanner.nextDouble();
		
		 System.out.println("Do you want to open a salary account (true/false)");
		 isSalary = scanner.nextBoolean();
		 
		Savings account = new Savings( accountNumber,name,balance,isSalary);
		
		
		
		System.out.println(account);
	do
	{
		System.out.println("select your chooice");
		
		System.out.println("Press 1 to withdraw");
		System.out.println("Press 2 to deposit");
		System.out.println("Press 3 to see balanace");
		
		press = scanner.nextInt();
		
		switch (press)
		{
		case 1: 
			
			System.out.println("Enter the amount you need to withdraw");
			amount = scanner.nextInt();
			result = account.withdraw(amount);
		if(result)
		{
			System.out.println("sucess");
		}
		else
		{
			System.out.println("deny");
		}
		System.out.println(account.getBalance());
		break;
		
		
		case 2: System.out.println("Enter the amount you need to deposit");
		amount = scanner.nextInt();
		result = account.deposit(amount);
		if(result)
		{
			System.out.println("sucess");
		}
		else
		{
			System.out.println("deny");
		}
			System.out.println(account.getBalance());
		break;
		
		
		case 3: System.out.println("Available Balance: "+account.getBalance());
		break;
		
		default: System.out.println("Invalid chooice");
		}
		System.out.println("do u want to continue");
		chooice = scanner.next();
		
	}while(chooice.equals("yes"));
}
	
}
