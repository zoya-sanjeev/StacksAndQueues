package com.bridgelabz.stacksandqueues;

public class MyStack<K> {
	LinkedList<K> linkedList;
	
	MyStack(){
		this.linkedList=new LinkedList<>();
	}
	
	void push(INode newNode) {
		linkedList.add(newNode);
	}
	
	void printStack() {
		linkedList.printNodes();
	}
}
