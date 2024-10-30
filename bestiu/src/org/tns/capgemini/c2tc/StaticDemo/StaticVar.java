package org.tns.capgemini.c2tc.StaticDemo;

public class StaticVar {
	String name;
	double price;
	static String category="Smart Phone";
	
	StaticVar(String name,double price){
		this.name=name;
		this.price=price;
	}
	public void displayDetails() {
		System.out.println("Name :" + name);
		System.out.println("Price:" + price);
		System.out.println("Category :" + category);
	}

	public static void main(String[] args) {
		StaticVar obj=new StaticVar("Redmi",15000);
		StaticVar obj1=new StaticVar("Iphone",70000);
		obj.displayDetails();
		obj1.displayDetails();
	}

}