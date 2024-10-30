package org.tns.capgemini.c2tc.StaticDemo;
class StaticBlockDemo{
	public void display() {
		System.out.println("Instance Block-1");
	}
	static {
		System.out.println("Static Block-1");
	}
	static {
		System.out.println("Static Block-2");
	}
}
public class StaticBlock {

	public static void main(String[] args) {
		StaticBlockDemo obj=new StaticBlockDemo();
		obj.display();

	}

}