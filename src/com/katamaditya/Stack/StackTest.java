/**
 * 
 */
package com.katamaditya.Stack;

/**
 * @author VeeraSivaSriAditya
 *
 */
public class StackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Stack stack = new Stack();
		stack.push(10);
		System.out.println("Element is: "+stack.peek());
		stack.push(20);
		System.out.println("Element is: "+stack.peek());
		stack.pop();
		System.out.println("Element is: "+stack.peek());
		stack.push(40);
		System.out.println("Element is: "+stack.peek());
		stack.pop();
		System.out.println("Element is: "+stack.peek());
		stack.pop();
		System.out.println("Element is: "+stack.peek());
		stack.pop();
		System.out.println("Element is: "+stack.peek());
	}

}
