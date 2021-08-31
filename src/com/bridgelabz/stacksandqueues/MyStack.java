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
	
	public void popAll() {
		INode currentNode;
		while(linkedList.head!=null) {
			currentNode=linkedList.head;
			peak();
			System.out.println(currentNode.getKey()+" popped");
			linkedList.head = linkedList.head.getNext();
			currentNode=null;
		}
	}
}
