package com.test;

import java.util.HashMap;
import java.util.List;

public class Snippet implements InterafceI1, InterafceI2{
	
	
	
	public static void main(String[] args) {
		
		String str = "apple java apple";
		HashMap<String, Integer> map = new HashMap<>();
		
		
		String[] list = str.split(" ");
		
		for(String stri: list) {
			
			if(map.containsKey(stri)) {
				map.put(stri, map.get(stri)+1);
			}else { 
				
				map.put(stri, 1);
			}
		}
		System.out.println(map.toString());
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		m1();
	}

}
