package org.practiceprograms;
import java.util.Scanner;
public class Arthmeticexceptionwhendividingbyzero {
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the numerator: ");
		        int numerator = scanner.nextInt();
		        System.out.print("Enter the denominator: ");
		        int denominator = scanner.nextInt();
		        try {
		            int result = numerator / denominator;
		            System.out.println("Result: " + result);
		        } catch (ArithmeticException e) {
		            System.out.println("Error: Division by zero is not allowed.");
		        } finally {
		            scanner.close();
		        }
		    }
	}
