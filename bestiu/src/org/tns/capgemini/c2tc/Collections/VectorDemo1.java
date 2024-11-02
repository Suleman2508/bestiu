package org.tns.capgemini.c2tc.Collections;
import java.util.List;
import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		List<Integer> numbers=new Vector<>();
		
		numbers.add(20);
		numbers.add(10);
		numbers.add(30);
		numbers.add(40);
		
		numbers.sort(null);
		
		System.out.println(numbers);
		
		System.out.println("First number : " + numbers.get(0));
		
		numbers.set(1,25);
		
		numbers.remove(Integer.valueOf(20));
		
		if(numbers.contains(10))
		{
			System.out.println("10 is in the list");
		}
		else
		{
			System.out.println("Required element is not in the list");
		}
		
		
		for(Integer number:numbers)
		{
			System.out.println(number);
		}
		
		
		System.out.println("size of the vector :"  + numbers.size());
		
		numbers.clear();
		
		System.out.println("After clear no of numbers persent is" + numbers);
		
	}

}

	