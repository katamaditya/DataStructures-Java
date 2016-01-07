package com.katamaditya.LinkedList;
/**
 * @author VeeraSivaSriAditya
 *
 */
public class DoublyLinkedList {

	private DoublyLinkedListNode head;
	private int count;

	public DoublyLinkedListNode getHead() {
		return head;
	}

	public void setHead(DoublyLinkedListNode head) {
		this.head = head;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	private void decrementCount() {
		count--;
	}

	private void incrementCount() {
		count++;
	}

	public void add(Object data, int index) {

		if (index > 0 && index < count + 2) {

			DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);

			if (head == null) {
				head = newNode;
				incrementCount();
				return;
			} else if (index == 1) {
				newNode.setNext(head);
				head.setPrev(newNode);
				this.head = newNode;
				incrementCount();
				return;
			}

			DoublyLinkedListNode temp = head;

			for (int i = 1; i < index - 1; i++) {
				temp = temp.getNext();
			}
			newNode.setPrev(temp);
			newNode.setNext(temp.getNext());
			if (temp.getNext() != null)
				temp.getNext().setPrev(newNode);
			temp.setNext(newNode);
			incrementCount();
		} else {
			System.out.println("Unabe to add! Invalid Index");
		}
	}

	public boolean isEmpty() {
		if (head == null) {
			System.out.println("Empty List");
			return true;
		}
		return false;
	}

	public boolean remove(int index) {

		if (index > 0 && index < count + 1) {
			if (isEmpty())
				return false;
			DoublyLinkedListNode temp = head;
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
		DoublyLinkedListNode temp = head;
		System.out.println("List: ");
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

	public void reversePrint() {
		if(isEmpty()) return;
		DoublyLinkedListNode temp = head;
		System.out.println("Reverse List: ");
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getPrev();
		}
	}
}
