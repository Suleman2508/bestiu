package org.tns.capgemini.c2tc.java;

public class Bitwise {

	public static void main(String[] args) {
		 int a = 8;  // 0110 in binary
	        int b = 2;  // 0010 in binary

	        // Bitwise AND
	        System.out.println("a & b: " + (a & b));  

	        // Bitwise OR
	        System.out.println("a | b: " + (a | b));  

	        // Bitwise XOR 
	        System.out.println("a ^ b: " + (a ^ b));  

	        // Bitwise NOT
	        System.out.println("~a: " + (~a)); 

	        // Left shift
	        System.out.println("a << 2: " + (a << 2));  
	    
	        // Right shift
	        System.out.println("a >> 2: " + (a >> 2)); 
	        
	}

}
