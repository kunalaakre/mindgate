package com.mindgate.pojo;

public class Current extends Account
{
	private double overdraftBalance;
	private double initialoverdraftalance;
	
	
	public Current()
	{
		// TODO Auto-generated constructor stub
	}


	public Current(int accountNumber, String name, double balance, double overdraftBalance)
	{
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		this.initialoverdraftalance = overdraftBalance;
	}
	
	
	@Override
	public boolean withdraw(double amount) 
	{
		if(amount>0 && amount<=getBalance())
		{
			setBalance(getBalance()-amount);
			return true;
		}
		
		if(amount>0 && amount>getBalance() && amount<getBalance()+overdraftBalance)
			{
				amount = amount-getBalance();
				setBalance(0);
				overdraftBalance = overdraftBalance-amount;
				return true;
			}
		
		return false;
	}
	
	
	@Override
	public boolean deposit(double amount)
	{
		if(amount>0)
		{
			if(overdraftBalance<initialoverdraftalance)
			{
				double difference = initialoverdraftalance-overdraftBalance;
				if(difference<amount)
				{
					amount = amount-difference;
					overdraftBalance = initialoverdraftalance;
					setBalance(getBalance()+amount);
					return true;
				}
				else
				{
					overdraftBalance = overdraftBalance+amount;
					return true;
				}
				
			}
			else
			{
				setBalance(getBalance()+amount);
				return true;
			}
		}
		
		return false;
	}


	public double getOverdraftBalance()
	{
		return overdraftBalance;
	}


	public void setOverdraftBalance(double overdraftBalance)
	{
		this.overdraftBalance = overdraftBalance;
	}


	
	
	
	
}
