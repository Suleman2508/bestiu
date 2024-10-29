package org.tns.capgemini.c2tc.Constructor_Demo;
class MyClass2
{
	String color;
	int cost;
	String brand;
MyClass2(String color,int cost,String brand)
{
	this.color=color;
	this.cost=cost;
	this.brand=brand;
}
}

public class ParameterisedConstructor {

	public static void main(String[] args) {
		MyClass2 obj=new MyClass2("White",5000,"Audi");
		MyClass2 obj2=new MyClass2("Black",6000,"BMW");
		System.out.println(obj.color+" "+obj.cost+" "+obj.brand);
		System.out.println(obj2.color+" "+obj2.cost+" "+obj2.brand);
	}

}
