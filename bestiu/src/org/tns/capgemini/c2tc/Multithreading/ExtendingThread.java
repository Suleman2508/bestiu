package org.tns.capgemini.c2tc.Multithreading;
class Eclipse extends Thread
{
	public void run()
	{
		System.out.println("Eclipse id"+" "+Thread.currentThread().getId());
	}
}
class OneNote extends Thread
{
	public void run()
	{
		System.out.println("OneNote id"+" "+Thread.currentThread().getId());
	}
}
class chrome extends Thread
{
	public void run()
	{
		System.out.println("Chrome id"+" "+Thread.currentThread().getId());
	}
}

public class ExtendingThread {

	public static void main(String[] args) {
		Eclipse obj=new Eclipse();
		obj.start();
		OneNote obj1=new OneNote();
		obj1.start();
		Chrome3 obj2=new Chrome3();
		obj2.start();
		for (int i=0;i<5;i++) {
			System.out.println("Main method thread id is " + "  " + Thread.currentThread().getId());

	}
	}
}