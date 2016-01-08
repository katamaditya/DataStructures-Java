/**
 * 
 */
package com.katamaditya.Queue;

/**
 * @author VeeraSivaSriAditya
 *
 */
public class QueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Queue queue = new Queue();
		
		queue.add(10);
		System.out.println(queue.peek());
		queue.add(20);
		System.out.println(queue.peek());
		queue.remove();
		System.out.println(queue.peek());
		queue.add(30);
		System.out.println(queue.peek());
		queue.add(40);
		System.out.println(queue.peek());
		queue.remove();
		System.out.println(queue.peek());

	}

}
