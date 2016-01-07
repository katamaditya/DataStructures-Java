package com.katamaditya.Stack;

import com.katamaditya.LinkedList.SinglyLinkedListNode;

/**
 * @author VeeraSivaSriAditya
 *
 */

public class Stack {

	private SinglyLinkedListNode top;

	public Stack() {
		this.top = null;
	}

	public SinglyLinkedListNode getTop() {
		return top;
	}

	public void setTop(SinglyLinkedListNode top) {
		this.top = top;
	}

	public void push(Object data) {
		SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
		newNode.setNext(top);
		top = newNode;
	}

	public boolean isEmpty() {
		if (top == null) {
			return true;
		}
		return false;
	}

	public Object pop() {
		if (isEmpty()) {
			System.out.println("Unable to pop! Empty Stack");
			return (Integer) null;
		}
		Object temp = top.getData();
		top = top.getNext();
		return temp;
	}

	public Object peek() {
		if (isEmpty()) {
			System.out.println("Empty Stack");
			return null;
		}
		return top.getData(); 
	}
}
