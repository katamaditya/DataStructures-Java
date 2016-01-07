package com.katamaditya.LinkedList;
/**
 * @author VeeraSivaSriAditya
 *
 */
public class DoublyLinkedListTest {

	public static void main(String[] args) {
		DoublyLinkedList linkedList = new DoublyLinkedList();
		linkedList.print();
		linkedList.add(1, 1);
		linkedList.add(2, 2);
		linkedList.print();
		linkedList.remove(1);
		linkedList.print();
		linkedList.add(3, 2);
		linkedList.add(4, 3);
		linkedList.print();
		linkedList.reversePrint();
		/*linkedList.print();
		linkedList.reverseWithIteration();
		linkedList.print();
		linkedList.reverseWithRecursion(linkedList.getHead());
		linkedList.print();
		System.out.println("Printed using recursion List: ");
		linkedList.printWithRecursion(linkedList.getHead());
		System.out.println("Print list reverse recursively without actually reversing the list \nList: ");
		linkedList.printReverseWithRecursion(linkedList.getHead());*/
		/*linkedList.remove(1);
		linkedList.print();
		linkedList.remove(3);
		linkedList.print();*/
	}

}
