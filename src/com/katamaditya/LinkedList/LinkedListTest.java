package com.katamaditya.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();
		
		linkedList.add(1, 1);
		linkedList.add(2, 1);
		linkedList.add(3, 2);
		linkedList.add(4, 1);
		
		linkedList.print();
		linkedList.reverseWithIteration();
		linkedList.print();
		linkedList.reverseWithRecursion(linkedList.getHead());
		linkedList.print();
		System.out.println("Printed using recursion List: ");
		linkedList.printWithRecursion(linkedList.getHead());
		System.out.println("Print list reverse recursively without actually reversing the list \nList: ");
		linkedList.printReverseWithRecursion(linkedList.getHead());
		/*linkedList.remove(1);
		linkedList.print();
		linkedList.remove(3);
		linkedList.print();*/

	}

}
