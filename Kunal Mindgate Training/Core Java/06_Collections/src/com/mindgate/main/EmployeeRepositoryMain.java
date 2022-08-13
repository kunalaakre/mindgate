package com.mindgate.main;

import java.util.List;

import com.mindagte.repository.EmployeeRepository;
import com.mindgate.pojo.Employee;

public class EmployeeRepositoryMain 
{
	public static void main(String[] args) 
	{
		
		
		Employee employee1 = new Employee(101, "Kunal", 1000);
		Employee employee2 = new Employee(102, "xyz", 1000);
		Employee employee3 = new Employee(103, "por", 1000);
		
		//obj ko repo ma bheja
		
		EmployeeRepository employeeRepsitory = new EmployeeRepository();//repo ke methods use karneka maine idar repo ka obj banaya hai
		
		employeeRepsitory.addEmployee(employee1);
		employeeRepsitory.addEmployee(employee2);
		employeeRepsitory.addEmployee(employee3);
		
		
		
		List<Employee> employees = employeeRepsitory.getAllEmployees();//method se list milta toh v store it in List
		
		
		//ab sab data employees variable ma hai.
		
		 
		for(Employee employee: employees)
		{
			System.out.println(employee);
		}
		
		System.out.println("----------------------------");
	
		System.out.println("search");
		
		System.out.println();
		Employee e =employeeRepsitory.getEmployeeById(101);
		System.out.println(e);
		System.out.println("--------------------------");
		
		System.out.println("Just all 3");
		for(Employee employee: employees)
		{
			System.out.println(employee);
		}
		
		
		System.out.println("--------------------------");
		System.out.println("After remove");
		System.out.println();
		boolean e1 = employeeRepsitory.deleteEmployeeByid(101);
		for(Employee employee: employees)
		{
			System.out.println(employee);
		}
		System.out.println("----------------------------");
		System.out.println("for Update");
		System.out.println();
		
		System.out.println("before update");
		for(Employee employee: employees)
		{
			System.out.println(employee);
		}
		System.out.println();
		
		System.out.println("after update");
		
		boolean res = employeeRepsitory.updateEmployee(new Employee(102,"Sanil",500));
		 //List<Employee> l = employeeRepsitory.getAllEmployees();
		 for(Employee employee: employees)
			{
				System.out.println(employee);
			}
		 
		
		
		
		
		
		
		
		
		
	}
	
}
