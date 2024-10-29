package org.practiceprograms;
import java.util.Scanner;
public class Javaproduct {
		    public static int multiply(int a, int b) {
		        return a * b;
		    }
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the first number: ");
		        int num1 = scanner.nextInt();
		        System.out.print("Enter the second number: ");
		        int num2 = scanner.nextInt();
		        int product = multiply(num1, num2);
		        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
		        scanner.close();
		    }
	
	}


