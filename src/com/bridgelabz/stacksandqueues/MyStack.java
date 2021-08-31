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
	
	INode peak() {
		return linkedList.head;
	}
	public INode pop() {
		INode temp=linkedList.pop();
		return temp;
	}
}
