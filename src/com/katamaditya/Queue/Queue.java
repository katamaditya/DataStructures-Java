/**
 * 
 */
package com.katamaditya.Queue;

import com.katamaditya.LinkedList.SinglyLinkedListNode;

/**
 * @author VeeraSivaSriAditya
 *
 */
public class Queue {
	
	private SinglyLinkedListNode head, tail;
	
	public Queue() {
		super();
		this.head = null;
		this.tail = null;
	}

	public void add(Object data){
		
		SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
		
		if(isEmpty()){
			head = newNode;
			tail = newNode;
		}		
		tail.setNext(newNode);
		tail = newNode;
		
	}
	
	public boolean isEmpty(){
		if(head == null && tail == null) return true;
		return false;
	}
	
	public void remove(){
		if(isEmpty()){
			System.out.println("Empty Queue!! Unable to remove..");
			return;
		}
		else if (head == tail){
			head = tail = null;
			return;
		}
		head = head.getNext();
	}
	
	public Object peek(){
		if(isEmpty()) return null;
		return head.getData();
	}
	
}
