package org.tns.capgemini.c2tc.java;

public class WhileLoop {

	public static void main(String[] args) {
		int i=1;
		while(i<=100) {
			if(i==3 || i==65)
			{
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}
