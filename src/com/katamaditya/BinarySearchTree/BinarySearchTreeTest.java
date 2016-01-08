/**
 * 
 */
package com.katamaditya.BinarySearchTree;

/**
 * @author VeeraSivaSriAditya
 *
 */
public class BinarySearchTreeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		
		binarySearchTree.insert(20);
		binarySearchTree.insert(10);
		binarySearchTree.insert(30);
		binarySearchTree.insert(15);
		//binarySearchTree.insert(300);
		/*System.out.println(binarySearchTree.search(10));
		System.out.println(binarySearchTree.search(60));
		System.out.println(binarySearchTree.search(20));
		System.out.println(binarySearchTree.search(30));
		System.out.println(binarySearchTree.minByIteration());
		System.out.println(binarySearchTree.minByRecursion());
		System.out.println(binarySearchTree.maxByIteration());
		System.out.println(binarySearchTree.maxByRecursion());*/
		System.out.println("Height of Tree: "+binarySearchTree.height());
	}

}
