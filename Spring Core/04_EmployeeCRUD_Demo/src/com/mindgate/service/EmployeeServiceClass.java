package com.mindgate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mindgate.repository.EmployeeRepositoryInterface;


@Service
public class EmployeeServiceClass implements EmployeeServiceInterface 
{
	@Autowired
	private EmployeeRepositoryInterface employeeRepositoryInterface;
	
	
	public EmployeeRepositoryInterface getEmployeeRepositoryInterface() 
	{
		return employeeRepositoryInterface;
	}


	public void setEmployeeRepositoryInterface(EmployeeRepositoryInterface employeeRepositoryInterface) {
		this.employeeRepositoryInterface = employeeRepositoryInterface;
	}


	@Override
	public boolean addEmployee()
	{
		System.out.println("Employee Service addEmployee()");
		return employeeRepositoryInterface.addEmployee();
	}

}
