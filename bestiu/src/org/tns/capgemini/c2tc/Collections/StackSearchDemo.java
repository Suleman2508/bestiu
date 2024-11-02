package org.tns.capgemini.c2tc.Collections;

import java.util.Stack;
public class StackSearchDemo {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		stack.push(35);
		stack.push(27);
		stack.push(75);
		stack.push(86);
		stack.push(90);
		
		System.out.println("Position of 35:"+ stack.search(35));
		System.out.println("Position of 27:"+ stack.search(27));
		System.out.println("Position of 75:"+ stack.search(75));
		System.out.println("Position of 86:"+ stack.search(86));
		System.out.println("Position of 90:"+ stack.search(90));
	}

}