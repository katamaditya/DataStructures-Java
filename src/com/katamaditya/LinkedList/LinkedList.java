package com.katamaditya.LinkedList;

public class LinkedList {

	private Node head;
	private int count;

	public LinkedList() {
		this.head = null;
		this.count = 0;
	}

	public void incrementCount() {
		count++;
	}

	public void decrementCount() {
		count--;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void add(int data, int index) {

		Node newNode = new Node(data);

		if (index == 1) {
			newNode.setNext(getHead());
			this.head = newNode;
			incrementCount();
			return;
		}

		Node temp = head;
		for (int i = 1; i < index-1; i++) {
			temp = temp.getNext();
		}
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
		incrementCount();
	}

	public boolean remove(int index) {

		Node temp = head;
		if (head != null) {
			if (index == 1) {
				this.head = temp.getNext();
				decrementCount();
				return true;
			}

			for (int i = 1; i < index-1; i++) {
				temp = temp.getNext();
			}
			
			temp.setNext(temp.getNext().getNext());
			decrementCount();
			return true;
		}
		return false;
	}

	public void print() {

		if (getCount() < 1) {
			System.out.println("Empty List!!");
		}
		Node temp = head;
		System.out.println("List: ");
		while (temp != null) {
			System.out.println(temp.getData() + " ");
			temp = temp.getNext();
		}
	}

	public void printWithRecursion(Node current){
		if(current == null) return;
		System.out.println(current.getData()+" ");
		printWithRecursion(current.getNext());
	}
	
	public void printReverseWithRecursion(Node current){
		if(current == null) return;
		printReverseWithRecursion(current.getNext());
		System.out.println(current.getData()+" ");		
	}
	
	public void reverseWithIteration(){
		
		Node current = head;
		Node next, prev = null;
		while(current != null){
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		head  = prev;
	}
	
	public void reverseWithRecursion(Node current){
		//Node current = head;
		if(current.getNext()== null){
			head = current;
			return;
		}
		reverseWithRecursion(current.getNext());
		current.getNext().setNext(current);
		current.setNext(null);
	}
}









