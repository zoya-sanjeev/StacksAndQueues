package com.bridgelabz.stacksandqueues;

public class MyQueue<K> {
	
	LinkedList linkedList;
	
	MyQueue(){
		linkedList=new LinkedList();
	}
	
	void enqueue(INode newNode) {
		linkedList.append(newNode);
	}
	


}
