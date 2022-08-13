package com.mindagte.repository;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.pojo.Employee;

public class EmployeeRepository 
{
	private List<Employee> employeeList = new ArrayList<Employee>();//to store objects humne arraylist ka obj banaya hai
	
	
	
	public boolean addEmployee(Employee employee)
	{
		return employeeList.add(employee);// main se aya hua obj upar vale list ma add hogaya
	}
	
	
	
	
	public List<Employee> getAllEmployees()
	{
		return employeeList;
	}
	
	
	
	
	public Employee getEmployeeById(int employeeId)
	{
		for(Employee employee : employeeList)
		{
			if(employee.getEmployee()==employeeId)
			{
				return employee;
			}
		}
		return null;
	}
	
	
	
	
	
	public boolean deleteEmployeeByid(int employeeId)
	{
		for(Employee employee: employeeList)
		{
			if(employee.getEmployee()==employeeId)
			{
			boolean res = employeeList.remove(employee);
			return res;
			}
		}
		return false;
	}
	
	
	public boolean updateEmployee(Employee e)
	{
		
		for(Employee employee:employeeList)
		{
			if(employee.getEmployee()==e.getEmployee())
			{
				employee.setName(e.getName());
				employee.setSalary(e.getSalary());
				return true;
			}
		}
		return false;
	}
	
	
	
}
