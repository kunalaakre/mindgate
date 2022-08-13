package com.mindgate.main;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import com.mindgate.pojo.Employee;

public class CollectionsMain 
{
	public static void main(String[] args) 
	{
		List<String> nameList = new ArrayList<>(); 
		
		nameList.add("Kunal");
		nameList.add("Gauri");
		nameList.add("Rishab");
		nameList.add("Rohan");
		nameList.add("Nikhil");
		nameList.add("Kunal");
		System.out.println("Size: "+ nameList.size());
		System.out.println(nameList);
		nameList.remove(0);
		System.out.println(nameList);
		System.out.println("Size: "+nameList.size());
		
		System.out.println("-------------------------------");
		
		List<Employee> employeeList = new ArrayList<>();
		Employee employee1 = new Employee(101,"Sayak",1000);
		Employee employee2 = new Employee(102, "Sakshi",1000);
		Employee employee3 = new Employee(103, "Yash", 1000);
		
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		
		for(Employee e : employeeList)
		{
			System.out.println(e);
		}
		
		System.out.println("-------------------------------");
		System.out.println(employeeList);
		
		
		System.out.println("--------------------------------");
		System.out.println("Use of Set");
		System.out.println();
		Set<String> nameSet = new HashSet<>();
		nameSet.add("Janvi");
		nameSet.add("Tanya");
		nameSet.add("Kanchan");
		nameSet.add("Mahesh");
		nameSet.add("Tanya");
		nameSet.add(null);
		nameSet.add(null);
		System.out.println(nameSet);
		System.out.println("---------------------------------");
		System.out.println("Use of TreeSet");
		
		SortedSet<String> sortedNameSet = new TreeSet<>();
		sortedNameSet.add("Janvi");
		sortedNameSet.add("Tanya");
		sortedNameSet.add("Kanchan");
		sortedNameSet.add("Mahesh");
		sortedNameSet.add("Tanya");
		
		
		System.out.println(sortedNameSet);
		
		System.out.println("----------------------------------");
		System.out.println("Use of HashMap");
		
		HashMap<Integer, String> employeeMap = new HashMap<>();
		employeeMap.put(101, "Kunal");
		employeeMap.put(102, "Rishab");
		employeeMap.put(103, "Sayak");
		employeeMap.put(104, "Yash");
		System.out.println(employeeMap);
		
		System.out.println("-----------------------------------");
		Integer i = 50;
		System.out.println(i.hashCode());
		
		System.out.println("------------------------------------");
		System.out.println("Use of sorted Map");
		System.out.println();
		
		
		SortedMap<Integer, String> employeeSortedMap = new TreeMap<>();
		employeeSortedMap.put(1, "Test1");
		employeeSortedMap.put(10, "Test2");
		employeeSortedMap.put(4, "Test3");
		employeeSortedMap.put(6, "Test4");
		
		System.out.println(employeeSortedMap);
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

