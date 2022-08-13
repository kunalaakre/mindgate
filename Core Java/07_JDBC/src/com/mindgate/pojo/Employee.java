package com.mindgate.pojo;

public class Employee 
{
	private int employeeeId;
	private String name;
	private double salary;
	
	public Employee() 
	{
		
	}

	public Employee(int employeeeId, String name, double salary) 
	{
		super();
		this.employeeeId = employeeeId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmployeeeId() 
	{
		return employeeeId;
	}

	public void setEmployeeeId(int employeeeId) 
	{
		this.employeeeId = employeeeId;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public double getSalary() 
	{
		return salary;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	@Override
	public String toString() 
	{
		return "Employee [employeeeId=" + employeeeId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
