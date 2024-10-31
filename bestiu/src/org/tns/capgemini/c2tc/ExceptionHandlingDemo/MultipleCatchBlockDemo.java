package org.tns.capgemini.c2tc.ExceptionHandlingDemo;

public class MultipleCatchBlockDemo {

	public static void main(String[] args) {
		int numbers[]=new int[4];
		try {
			numbers[9]=100/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException" +e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Exception" +e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("An unexpected Exception" +e.getMessage());
		}

	}

}