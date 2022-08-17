package com.mindgate.main;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class DependencyMain 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		
//		System.out.println();
//		System.out.println("Creating Address Object and calling the set methods ");
//		
//		Address address = new Address();
//		address.setAddressId(1);
//		address.setHouseNumber("401");
//		address.setBuildingName("Maggie");
//		address.setStreet("Nalambi Road");
//		address.setCity("Ambernath");
//		address.setPin("421505");
//		System.out.println(address);
//		System.out.println();
//		
//		
//		
//		System.out.println("Creating Employee Object and calling set method");
//		Employee employee = new Employee();
//		employee.setEmployeeId(101);
//		employee.setName("Kunal");
//		employee.setSalary(50000);
//		employee.setHomeAddress(address);
//		System.out.println(employee);
//		System.out.println();
		
		Address address = new Address(1, "401", "Maggie", "Nalambi Road", "Ambernath", "421505");
		
		
		Employee employee = new Employee(101, "Kunal", 10000, address);
		System.out.println(employee);
		
		System.out.println("Main Ends");
		
	
		
	}
}
