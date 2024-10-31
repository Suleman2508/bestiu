package org.tns.capgemini.c2tc.ExceptionHandlingDemo;
public class StringIndexOutOfBoundException {

	public static void main(String[] args) {
		String str="hello";
		try
		{
			char ch=str.charAt(5);
		    System.out.println(ch);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Thank You");
		}

	}

}