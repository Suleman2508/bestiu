package org.tns.capgemini.c2tc.String;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Initial Value");
		
		sb.append(" -Appended"); 
		sb.append(" -Again");  

		
		sb.insert(15, "[insert]");
		
		sb.replace(16 ,27,"[replaced]");
		
		sb.delete(2, 4);
		
		sb.reverse();
		
		System.out.println("Final stringbuilder result" +"   " + sb.toString());

	}

}