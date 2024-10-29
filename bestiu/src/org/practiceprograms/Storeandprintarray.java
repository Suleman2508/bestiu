package org.practiceprograms;
import java.util.Scanner;
public class Storeandprintarray {

	public static void main(String[] args) {
		        int[] numbers = new int[5];
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Please enter 5 integers:");
		        for (int i = 0; i < 5; i++) {
		            System.out.print("Enter integer " + (i + 1) + ": ");
		            numbers[i] = scanner.nextInt();
		        }
		        System.out.println("The integers you entered are:");
		        for (int i = 0; i < 5; i++) {
		            System.out.println(numbers[i]);
		        }
		        scanner.close();
		}

	}
