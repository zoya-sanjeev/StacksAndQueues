package com.bridgelabz.stacksandqueues;

public class MyQueue<K> {
	
	LinkedList linkedList;
	
	MyQueue(){
		linkedList=new LinkedList();
	}
	
	void enqueue(INode newNode) {
		linkedList.append(newNode);
	}
	
	void printQueue() {
		linkedList.printNodes();
	}
	
	void deQueue() {
		INode node=linkedList.pop();
		System.out.println(node.getKey()+" deleted");
	}

}
