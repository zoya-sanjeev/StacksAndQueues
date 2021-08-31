package com.bridgelabz.stacksandqueues;


public class StackQueueMain {
	public static void main(String[] args){
		
		Node<Integer> firstNode = new Node(56);
		Node<Integer> secondNode = new Node(30);
		Node<Integer> thirdNode = new Node(70);
		
		MyQueue<Integer> myQueue=new MyQueue<>();
		myQueue.enqueue(firstNode);
		myQueue.enqueue(secondNode);
		myQueue.enqueue(thirdNode);
		myQueue.printQueue();
		myQueue.deQueue();
		myQueue.printQueue();
		
	}

}
