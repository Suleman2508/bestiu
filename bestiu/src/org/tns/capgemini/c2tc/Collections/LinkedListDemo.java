package org.tns.capgemini.c2tc.Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> fruits=new LinkedList<>();
		fruits.add("Apple"); //add elements
		fruits.add("Mango");
		fruits.add("Dragon fruit");
		
		System.out.println("First fruit : " +fruits.get(0)); 
		
		fruits.set(1, "cherry"); 
		
		fruits.remove(2);
		if(fruits.contains("Apple")); 
		{
			System.out.println("Apple is in the list");
		}
		
		for (String fruit:fruits) {
		System.out.println(fruit);
		
		}
		
			fruits.clear();
			System.out.println("list cleared no of fruits " + fruits.size());
			System.out.println(fruits);
	}
	}

