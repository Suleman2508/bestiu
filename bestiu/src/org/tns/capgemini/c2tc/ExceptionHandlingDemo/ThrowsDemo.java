package org.tns.capgemini.c2tc.ExceptionHandlingDemo;

import java.io.IOException;

public class ThrowsDemo {
	void m1()
	{
		System.out.println("No Exception");
	}
	void m2() throws IOException
	{
		System.out.println("Device Error");
	}
	void m3() throws ArithmeticException, IOException, ClassNotFoundException 
	{
		System.out.println("File Not Found");
	}

	public static void main(String[] args) {
		ThrowsDemo obj=new ThrowsDemo();
		obj.m1();
		try {
			obj.m2();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}