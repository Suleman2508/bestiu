package org.tns.capgemini.c2tc.ExceptionHandlingDemo;
public class ErrorsDemo {

	public static void main(String[] args) {
		int a=200;
		int b=100;
		int sum=add(a,b);
		System.out.println(sum);
	}
	public static int add(int a,int b)
	{
		return a-b;
	}

}