package com.mindgate.main;

import java.util.List;
import java.util.Scanner;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeCRUDMain 
{
	public static void main(String[] args) 
	{
		int press;
		String choice ;
		List<Employee> allEmployees;
		EmployeeServiceInterface employeeServiceInterface = new EmployeeService();
		do
		{
		System.out.println("1. Add new Employee");
		System.out.println("2. Update Employee");
		System.out.println("3. Delete Employee");
		System.out.println("4. Select One Employee");
		System.out.println("5. Select all Employees");
		Scanner scanner = new Scanner(System.in);
		
		 press = scanner.nextInt();
		
		switch(press)
		{
		case 1: 
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("Enter id");
			int empid = scanner1.nextInt();
			System.out.println("Enter name");
			String name = scanner1.next();
			scanner1.nextLine();
			System.out.println("Enter Salary");
			double sal = scanner1.nextDouble();
			
			Employee employee = new Employee(empid,name,sal);
			
			
			
			
		boolean result = employeeServiceInterface.addNewEmployee(employee);
		
		if(result)
		{
			System.out.println("Insert Success");
		}
		
		else
		{
			System.out.println("Insert Failed");
		}
		break;
		
		case 5:
			allEmployees = employeeServiceInterface.getAllEmployees();
			for(Employee e: allEmployees)
			{
				System.out.println(e);
			}
			
			
			break;
		 
		case 3:
			System.out.println("Enter id");
			empid = scanner.nextInt();
			result = employeeServiceInterface.deleteEmployeeByEmployeeId(empid);
			
			
			if(result)
			{
				System.out.println("Insert Success");
			}
			
			else
			{
				System.out.println("Insert Failed");
			}
			
			break;
		default: System.out.println("Invalid chooice");
		break;
		}
		
		System.out.println("do u want to continue");
		choice = scanner.next();
		}while(choice.equals("yes"));
	}
}
