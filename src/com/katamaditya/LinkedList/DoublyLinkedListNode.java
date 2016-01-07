package com.katamaditya.LinkedList;
/**
 * @author VeeraSivaSriAditya
 *
 */
public class DoublyLinkedListNode {

	private Object data;
	
	private DoublyLinkedListNode next;
	
	private DoublyLinkedListNode prev;

	public DoublyLinkedListNode(Object data) {
		super();
		this.data = data;
		this.next = null;
		this.prev = null;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public DoublyLinkedListNode getNext() {
		return next;
	}

	public void setNext(DoublyLinkedListNode next) {
		this.next = next;
	}

	public DoublyLinkedListNode getPrev() {
		return prev;
	}

	public void setPrev(DoublyLinkedListNode prev) {
		this.prev = prev;
	}
	
}
