package com.katamaditya.LinkedList;

import com.katamaditya.Stack.Stack;

/**
 * @author VeeraSivaSriAditya
 *
 */
public class SinglyLinkedList {

	private SinglyLinkedListNode head;
	private int count;

	public SinglyLinkedList() {
		this.head = null;
		this.count = 0;
	}

	public void incrementCount() {
		count++;
	}

	public void decrementCount() {
		count--;
	}

	public SinglyLinkedListNode getHead() {
		return head;
	}

	public void setHead(SinglyLinkedListNode head) {
		this.head = head;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void add(Object data, int index) {

		if (index > 0 && index < count + 2) {
			SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

			if (index == 1) {
				newNode.setNext(getHead());
				this.head = newNode;
				incrementCount();
				return;
			}

			SinglyLinkedListNode temp = head;
			for (int i = 1; i < index - 1; i++) {
				temp = temp.getNext();
			}
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
			incrementCount();
		}
	}

	private boolean isEmpty() {
		if (head == null) {
			System.out.println("Empty List");
			return true;
		}
		return false;
	}
	
	public boolean remove(int index) {

		if (index > 0 && index < count + 1) {
			SinglyLinkedListNode temp = head;
			if (isEmpty()) return false;
				if (index == 1) {
					this.head = temp.getNext();
					decrementCount();
					return true;
				}

				for (int i = 1; i < index - 1; i++) {
					temp = temp.getNext();
				}

				temp.setNext(temp.getNext().getNext());
				decrementCount();
				return true;
			
		}
		System.out.println("Unabe to remove! Invalid Index");
		return false;

	}

	public void print() {

		if(isEmpty()) return;
		if (getCount() < 1) {
			System.out.println("Empty List!!");
		}
		SinglyLinkedListNode temp = head;
		System.out.println("List: ");
		while (temp != null) {
			System.out.println(temp.getData() + " ");
			temp = temp.getNext();
		}
	}

	public void printWithRecursion(SinglyLinkedListNode current) {
		if(isEmpty()) return;
		if (current == null)
			return;
		System.out.println(current.getData() + " ");
		printWithRecursion(current.getNext());
	}

	public void printReverseWithRecursion(SinglyLinkedListNode current) {
		if(isEmpty()) return;
		if (current == null)
			return;
		printReverseWithRecursion(current.getNext());
		System.out.println(current.getData() + " ");
	}

	public void reverseUsingIteration() {

		SinglyLinkedListNode current = head;
		SinglyLinkedListNode next, prev = null;
		while (current != null) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		head = prev;
	}

	public void reverseUsingRecursion(SinglyLinkedListNode current) {
		// Node current = head;
		if (current.getNext() == null) {
			head = current;
			return;
		}
		reverseUsingRecursion(current.getNext());
		current.getNext().setNext(current);
		current.setNext(null);
	}
	
	public void reverseUsingStack(){
		SinglyLinkedListNode temp = head;
		Stack stack = new Stack();
		while(temp != null){
			stack.push(temp);
			temp = temp.getNext();
		}
		head = (SinglyLinkedListNode) stack.peek();
		temp = head;
		stack.pop();
		while(!stack.isEmpty()){
			temp.setNext((SinglyLinkedListNode) stack.peek());
			stack.pop();
			temp = temp.getNext();			
		}
		temp.setNext(null);
	}
}
