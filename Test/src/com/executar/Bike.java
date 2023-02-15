package com.executar;

public class Bike implements Cloneable{
	
	private Integer price;
	
	private String model;

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	
	@Override
	public String toString() {
		return "Bike [price=" + price + ", model=" + model + "]";
	}

	public Bike(Integer price, String model) {
		super();
		this.price = price;
		this.model = model;
	}
	
	
	
	

	

}
