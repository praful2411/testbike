package com.map;

public class LambdaTestImpl {
	
	public void m2() {
		
		return "m2 got called";
	}

	public static void main(String[] args) {
		LambdaTestImpl terrr = new LambdaTestImpl();
		
		
		LambdaTest test = (et) -> {
			return et;
		};
		
		LambdaTestImpl tesrrr = tesrrr::m2;
		
		
		System.out.println(test.m1(3));
	}

	private static void m1(int i) {
		// TODO Auto-generated method stub
		
	}
}
