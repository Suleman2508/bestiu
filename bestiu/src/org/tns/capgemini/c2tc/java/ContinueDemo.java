package org.tns.capgemini.c2tc.java;

public class ContinueDemo {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i==6 || i==25 || i==39) {
				continue;
			}
			System.out.println(i);
		}
	}

}
