package com.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorByJava8 {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(22,"Saurabh");
		Employee emp2 = new Employee(66,"Kunal");
		Employee emp3 = new Employee(55,"Jhon ");
		Employee emp4 = new Employee(33,"SMith");
		Employee emp5 = new Employee(88,"Andy");
		Employee emp6 = new Employee(65,"Taylor");
		
		//System.out.println();
		List<Employee> list = new ArrayList<>();
		
		list.add(emp6);
		list.add(emp5);
		list.add(emp4);
		list.add(emp3);
		list.add(emp2);
		list.add(emp1);
		System.out.println(list);
		List<Employee> filterList = list.stream().sorted((kk , jj) -> kk.getRank().compareTo(jj.getRank()))
				.collect(Collectors.toList());
		
		List<Employee> filterList2 = list.stream().sorted(Comparator.comparingInt(Employee::getRank).reversed()).collect(Collectors.toList());
		System.out.println(filterList2);
	}

}
