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
		
		binarySearchTree.insert(1);
		binarySearchTree.insert(0);
		binarySearchTree.insert(-1);
		binarySearchTree.insert(5);
		binarySearchTree.insert(3);
		binarySearchTree.insert(10);
		binarySearchTree.insert(8);
		binarySearchTree.insert(11);
		//binarySearchTree.insert(300);
		/*System.out.println(binarySearchTree.search(10));
		System.out.println(binarySearchTree.search(60));
		System.out.println(binarySearchTree.search(20));
		System.out.println(binarySearchTree.search(30));
		System.out.println(binarySearchTree.minByIteration());
		System.out.println(binarySearchTree.minByRecursion());
		System.out.println(binarySearchTree.maxByIteration());
		System.out.println(binarySearchTree.maxByRecursion());
		System.out.println("Height of Tree: "+binarySearchTree.height());
		binarySearchTree.breadthFirstTraversal();
		binarySearchTree.depthFirstTraversal(1);//preorder
		binarySearchTree.depthFirstTraversal(2);//inorder
		binarySearchTree.depthFirstTraversal(3);//postorder*/
		//binarySearchTree.delete(3);
		binarySearchTree.breadthFirstTraversal();
		System.out.println("Successor is: "+binarySearchTree.inorderSuccessor(10));
	}

}
