package org.tns.capgemini.c2tc.Constructor_Demo;
class MyClass{
	String color;
	int cost;
	String brand;
}
public class Before_Constructor {

	public static void main(String[] args) {
		MyClass obj=new MyClass();
		System.out.println(obj.color+" "+obj.cost+" "+obj.brand);
	}

}
