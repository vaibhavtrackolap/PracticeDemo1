package com.javamaven.demo1;

import java.util.List;
import java.util.stream.Collectors;

public class App 
{
	public static List<Object> getDept(){
		return Database.getEmployee().stream().filter(emp -> emp.getDept() == "HR").collect(Collectors.toList());
	}
    public static void main( String[] args )
    {
        System.out.println(getDept());
    }
}
