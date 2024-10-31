package org.tns.capgemini.c2tc.ExceptionHandlingDemo;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {
		String str=null;
		try {
			System.out.println(str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("no matter what this block we get excecuted");
		}

	}

}