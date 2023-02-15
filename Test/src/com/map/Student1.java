package com.map;

import java.util.ArrayList;
import java.util.LinkedList;

class Student1 {
	
	private int code;
	private String name;
	
	private int age;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + code;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		if (age != other.age)
			return false;
		if (code != other.code)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Student1(int code, String name, int age) {
		super();
		this.code = code;
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		
		ArrayList<String> stringArr = new ArrayList<>();
		System.out.println(stringArr);
		stringArr.add(0, null);
		stringArr.set(0, " ");
		stringArr.add(1, null);
		System.out.println(stringArr.size());
		
		LinkedList<Object> l = new LinkedList<>();
	    l.add(0, null);
		l.add(0, " ");
		l.add(1, null);
		
		System.out.println(l.size());
	}

	
}

 class Student{
	
}
