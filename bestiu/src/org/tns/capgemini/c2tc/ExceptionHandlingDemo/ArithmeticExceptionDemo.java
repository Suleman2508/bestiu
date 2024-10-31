package org.tns.capgemini.c2tc.ExceptionHandlingDemo;
public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		int number_one=500/50;
		System.out.println(number_one);
		int number_two=500/100;
		System.out.println(number_two);
		try 
		{
			int number_three=500/0;
			System.out.println(number_three);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		int number_four=500/25;
		System.out.println(number_four);

	}

}