package com.bridgelabz.stacksandqueues;


public class StackQueueMain {
	public static void main(String[] args){
		
		Node<Integer> firstNode = new Node(56);
		Node<Integer> secondNode = new Node(30);
		Node<Integer> thirdNode = new Node(70);
		
		MyStack<Integer> myStack=new MyStack<>();
		myStack.push(firstNode);
		myStack.push(secondNode);
		myStack.push(thirdNode);
		myStack.printStack();
		INode topOfStack=myStack.peak();
		System.out.println(topOfStack.getKey());
		
	}

}
