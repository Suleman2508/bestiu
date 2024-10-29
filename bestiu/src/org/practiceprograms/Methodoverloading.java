package org.practiceprograms;

public class Methodoverloading {
	    public static int multiply(int a, int b) {
	        return a * b;
	    }
	    public static double multiply(double a, double b) {
	        return a * b;
	    }
	    public static void main(String[] args) {
	        int intResult = multiply(5, 10);
	        System.out.println("The product of two integers (5 * 10) is: " + intResult);
	        double doubleResult = multiply(5.5, 10.0);
	        System.out.println("The product of two doubles (5.5 * 10.0) is: " + doubleResult);
	    }
	}
