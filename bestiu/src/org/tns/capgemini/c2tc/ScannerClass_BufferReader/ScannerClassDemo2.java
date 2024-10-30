package org.tns.capgemini.c2tc.ScannerClass_BufferReader;
import java.util.Scanner;
public class ScannerClassDemo2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=scan.nextLine();
		
		System.out.println("Enter your age:");
		int age=scan.nextInt();

		System.out.println("Enter your Height:");
		float height=scan.nextFloat();
		
		System.out.println("Are you a Student?");
	    boolean isstudent=scan.nextBoolean();
	    
	    System.out.println("Enter your Aadhar");
	    long aadhar=scan.nextLong();
	    scan.nextLine();
	    
	    System.out.println("Enter your favourite teacher name:");
	    String teacher=scan.nextLine();
	    
	    System.out.println("Enter your hobby");
	    String hobby=scan.nextLine();
	    
	    System.out.println("Enter your daily reading time in minutes:");
	    byte readingtime=scan.nextByte();
	    
	    System.out.println("Enter your CGPA");
	    double cgpa=scan.nextDouble();
	    
	    System.out.println("Enter number of siblings you have:");
	    short siblings=scan.nextShort();
	    
	    System.out.println("Student Information");
	    System.out.println("Name:"+name);
	    System.out.println("Age:"+age);
	    System.out.println("Height:"+height);
	    System.out.println("Are you a student:"+isstudent);
	    System.out.println("aadhar"+aadhar);
	    System.out.println("Favourite teacher:"+teacher);
	    System.out.println("your hobby:"+hobby);
	    System.out.println("Reading time:"+readingtime);
	    System.out.println("CGPA:"+cgpa);
	    System.out.println(" no. of siblings:"+siblings);
	    scan.close();
	}

}