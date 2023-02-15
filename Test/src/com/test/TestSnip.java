package com.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestSnip {
	
	

	
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		Employee emp1 = new Employee(12, "Saurabh");
		Employee emp2 = new Employee(33, "Praful");
		Employee emp3 = new Employee(2, "Karan");
		Employee emp4 = new Employee(5, "ram");
		Employee emp5 = new Employee(44, "Pappu");
		list.add(emp5);
		list.add(emp4);
		list.add(emp3);
		list.add(emp2);
		list.add(emp1);
		
		
		List<Employee> filter = list.stream()
				.sorted(Comparator.comparingInt(Employee::getRank).reversed()).collect(Collectors.toList());
		
		List<String> slist = new ArrayList<>();
		slist.add("Saurabh");
		slist.add("Navin");
		slist.add("jan");
		slist.add("romil");
	
		int array[] = {10, 20, 25, 63, 96, 57};
		
		int temp, size;
		 size = array.length;
		
		for(int i= 0 ;i<size; i++) {
			
			for(int j = i+1;j<size;j++) {
			
				if(array[i]>array[j]) {
					
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					
					
				}
			}
		}
		
		System.out.println(array[size-2]);
		
		
		

		
		
		
	}
}
