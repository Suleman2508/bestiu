package org.tns.capgemini.c2tc.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<>();
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		
		System.out.println("front element (using peek):" +queue.peek() );
		
		System.out.println("Removed element(using poll)" +queue.poll());
		
		System.out.println("New front element (using peek)" +queue.peek());
		
		System.out.println("Removed element(using poll)" + queue.poll());
		System.out.println("Removed elemen(using poll)" + queue.poll());
		
		System.out.println("is queue empty " + queue.isEmpty() );
		
	}

}