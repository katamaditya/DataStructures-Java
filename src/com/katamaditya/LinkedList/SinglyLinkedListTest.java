package com.katamaditya.LinkedList;
/**
 * @author VeeraSivaSriAditya
 *
 */
public class SinglyLinkedListTest {

	public static void main(String[] args) {

		SinglyLinkedList linkedList = new SinglyLinkedList();
		
		linkedList.add(1, 1);
		linkedList.add(2, 2);
		linkedList.add(3, 3);
		linkedList.add(4, 4);
		
		linkedList.print();
		//linkedList.reverseUsingIteration();
		//linkedList.print();
		/*linkedList.reverseUsingRecursion(linkedList.getHead());
		linkedList.print();
		System.out.println("Printed using recursion List: ");
		linkedList.printWithRecursion(linkedList.getHead());
		System.out.println("Print list reverse recursively without actually reversing the list \nList: ");
		linkedList.printReverseWithRecursion(linkedList.getHead());*/
		System.out.println("Print list reverse using stack");
		linkedList.reverseUsingStack();
		linkedList.print();
		/*linkedList.remove(1);
		linkedList.print();
		linkedList.remove(3);
		linkedList.print();*/

	}

}
