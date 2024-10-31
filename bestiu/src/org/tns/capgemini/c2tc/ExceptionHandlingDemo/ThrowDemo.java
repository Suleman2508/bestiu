package org.tns.capgemini.c2tc.ExceptionHandlingDemo;

public class ThrowDemo {
	void validate(int age) {
		try {
			if(age<18)
			{
				throw new ArithmeticException("You are not eligible to c2tc");
			}
			else
			{
				System.out.println("You are eligible to c2tc");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		ThrowDemo obj=new ThrowDemo();
		obj.validate(23);
		System.out.println("hello");

	}

}