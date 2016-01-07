package com.katamaditya.LinkedList;
/**
 * @author VeeraSivaSriAditya
 *
 */
public class SinglyLinkedListNode {

	private Object data;
	
	private SinglyLinkedListNode next;
	
	public SinglyLinkedListNode(Object data){
		this.data = data;
		this.next = null;
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public SinglyLinkedListNode getNext() {
		return next;
	}
	public void setNext(SinglyLinkedListNode next) {
		this.next = next;
	}
	
	
}
