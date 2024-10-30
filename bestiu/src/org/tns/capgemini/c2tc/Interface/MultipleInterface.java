package org.tns.capgemini.c2tc.Interface;

interface Printer
{
	void print(String message);
}
interface Scanner{
	void scan(String document);
}

class MultiFunction implements Printer,Scanner
{

	@Override
	public void scan(String document) {
		System.out.println("Scanning " + document);
		
	}

	@Override
	public void print(String message) {
		System.out.println("Printing " +message );
		
	}
	
}
public class MultipleInterface {

	public static void main(String[] args) {
		MultiFunction device=new MultiFunction();
		device.scan("demo.pdf");
		device.print("hello world");

	}

}