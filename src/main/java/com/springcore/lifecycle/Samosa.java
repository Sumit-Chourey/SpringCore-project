package com.springcore.lifecycle;

public class Samosa {
	public double price;
	
	//Getter ,setter, constructor,toString

	public Samosa(double price) {
		super();
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		
		System.out.println("Setting property...price ");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init()
	{
		System.out.println("Inside init method");
	}
	public void destory()
	{
		System.out.println("Inside destory method");
	}
	

}






















