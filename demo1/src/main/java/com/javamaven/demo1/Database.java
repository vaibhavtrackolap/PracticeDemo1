package com.javamaven.demo1;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	
	public static List<Employee> getEmployee(){
		List<Employee> list = new ArrayList();
		list.add(new Employee(101,"Mark Zuckerberg", "Sales", 100000));
		list.add(new Employee(102,"Jack Dorsey", "HR", 200000));
		list.add(new Employee(103,"Parag Agarwal", "IT", 150000));
		list.add(new Employee(1014,"Elon Musk", "Operations", 170000));
		list.add(new Employee(1093,"Jeff Bezoz", "Sales", 230000));
		list.add(new Employee(1097,"Mukesh Ambani", "HR", 250000));
		return list;
	}
	
}
