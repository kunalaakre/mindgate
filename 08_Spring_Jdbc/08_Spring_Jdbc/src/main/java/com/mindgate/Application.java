package com.mindgate;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;

@SpringBootApplication
public class Application
{

	public static void main(String[] args)
	{
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		EmployeeService employeeService =applicationContext.getBean("employeeService", EmployeeService.class);
		
		
		
		boolean result = employeeService.deleteEmployee(1010);
		if(result)
		{
			System.out.println("Deleted Successfully");
		}
		else
		{
			System.out.println("Failed to delete");
		}
		
//		Employee employee = new Employee(1010,"Swati",5000);
//		boolean result = employeeService.updateEmployee(employee);
//		if(result)
//		{
//			System.out.println("Updated Successfully");
//		}
//		else
//		{
//			System.out.println("Failed to update");
//		}
		
		
//		Employee employee = employeeService.getEmployeeByEmployeeId(3);
//		System.out.println(employee);
		
		
		
		
		List<Employee> allEmployees = employeeService.getAllEmployees();
		
		for(Employee e:allEmployees)
		{
			System.out.println(e);
		}
	}

}
