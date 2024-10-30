package org.tns.capgemini.c2tc.ScannerClass_BufferReader;
import java.util.Scanner;
public class ScannerClassDemo1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name:");
		   String name=scan.nextLine();
		   System.out.println(name);
	    System.out.println("Enter your age:");
	       String age=scan.nextLine();
		   System.out.println(age);
		   scan.close();		
	}
}