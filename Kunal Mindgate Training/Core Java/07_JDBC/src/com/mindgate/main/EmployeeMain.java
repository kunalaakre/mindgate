package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id");
		int empid = scanner.nextInt();
		System.out.println("Enter name");
		String name = scanner.next();
		scanner.nextLine();
		System.out.println("Enter Salary");
		double sal = scanner.nextDouble();
		
		Employee employee = new Employee(empid,name,sal);
		
		
		EmployeeServiceInterface employeeServiceInterface = new EmployeeService();
		
	boolean result = employeeServiceInterface.addNewEmployee(employee);
	
	if(result)
	{
		System.out.println("Insert Success");
	}
	
	else
	{
		System.out.println("Insert Failed");
	}
	}
}
