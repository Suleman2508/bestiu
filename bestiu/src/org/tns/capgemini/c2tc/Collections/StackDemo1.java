package org.tns.capgemini.c2tc.Collections;

import java.util.Stack;

public class StackDemo1 {

	public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
		
		stack.push(10); 
		stack.push(20); 
		stack.push(30); 
		stack.push(40);
		
		
		System.out.println("Stack after push operation" + stack);
		
		
		System.out.println("top element" + stack.peek()); //40
		
	 
		System.out.println("Element popped" + stack.pop());
		System.out.println("Stack after pop" + stack);
		
		stack.clear();
		
		
		
		System.out.println("is stack empty " + stack.isEmpty());
		
		
		 int position=stack.search(20);
		 
		 if(position !=-1)
		 {
			 System.out.println("Element 2 found at the position  " + position);
		 }
		 else
		 {
			 System.out.println("Element 2 not found in the stack " +position);
		 }
	}

}