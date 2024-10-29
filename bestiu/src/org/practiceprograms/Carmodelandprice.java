package org.practiceprograms;

public class Carmodelandprice {

	public static void main(String[] args) {
		class Car {
		    private String model;
		    private double price;
		    public Car() {
		        model = "Toyota Camry";
		        price = 24000.00;
		    }
		    public void displayInfo() {
		        System.out.println("Car Model: " + model);
		        System.out.println("Car Price: $" + price);
		    }
		}
		        Car myCar = new Car();
		        myCar.displayInfo();
		    }
	}

