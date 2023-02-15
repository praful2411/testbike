package com.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Student> studentlist = new ArrayList<Student>();       
	      //Adding Students        
	      studentlist.add(new Student(11,"Jon",22));         
	      studentlist.add(new Student(22,"Steve",18));         
	      studentlist.add(new Student(33,"Lucy",22));         
	      studentlist.add(new Student(44,"Sansa",23));         
	      studentlist.add(new Student(55,"Maggie",18));
	      
	      String name = " sam";
	      
	      studentlist.stream().filter(stu -> {
	    	  
	    	  return stu.getName().equals(name);
	      }).filter(stu -> {
	    	  
	    	  return stu.getAge()<20;
	      }).collect(Collectors.toList());
	      
		
		}
	
}


