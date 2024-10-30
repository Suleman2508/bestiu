package org.tns.capgemini.c2tc.ScannerClass_BufferReader;
import java.util.Scanner;
public class AdvancedScannerMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter some data (you can enter numbers or text):");

        while (scan.hasNext()) {  
            if (scan.hasNextInt()) {  
                int intValue = scan.nextInt();
                System.out.println("Read an integer: " + intValue);
                scan.nextLine();  
            } 
            else if (scan.hasNextDouble()) {  
                double doubleValue = scan.nextDouble();
                System.out.println("Read a double: " + doubleValue);
                scan.nextLine();  
            } 
            else {  
                String stringValue = scan.next(); 
                System.out.println("Unknown input: " + stringValue);
            }
        }
        scan.close();

	}

}