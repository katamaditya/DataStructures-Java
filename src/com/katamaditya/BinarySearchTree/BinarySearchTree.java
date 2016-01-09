/**
 * 
 */
package com.katamaditya.BinarySearchTree;

import com.katamaditya.Queue.Queue;

/**
 * @author VeeraSivaSriAditya
 *
 */
public class BinarySearchTree {

	private BinarySearchTreeNode root;

	public BinarySearchTree() {
		super();
		this.root = null;
	}

	public void insert(Integer data) {
		BinarySearchTreeNode temp = root;
		this.root = insert(temp, data);
	}

	public boolean search(Integer data) {
		BinarySearchTreeNode temp = root;
		return searchInBST(temp, data);
	}

	private BinarySearchTreeNode insert(BinarySearchTreeNode root, Integer data) {

		if (root == null) {
			root = new BinarySearchTreeNode(data);
		} else if (data <= root.getData()) {
			root.setLeft(insert(root.getLeft(), data));
		} else {
			root.setRight(insert(root.getRight(), data));
		}
		return root;
	}

	private boolean searchInBST(BinarySearchTreeNode root, Integer data) {
		if (root == null)
			return false;
		else if (root.getData() == data)
			return true;
		else if (data < root.getData())
			return searchInBST(root.getLeft(), data);
		else
			return searchInBST(root.getRight(), data);
	}

	public Integer maxByRecursion() {
		BinarySearchTreeNode temp = root;
		return findMaxByRecursion(temp);
	}

	private Integer findMaxByRecursion(BinarySearchTreeNode root) {
		if (root == null) {
			System.out.println("Empty Tree");
			return null;
		}

		if (root.getRight() == null)
			return root.getData();

		return findMaxByRecursion(root.getRight());
	}

	public Integer maxByIteration() {
		BinarySearchTreeNode temp = root;
		if (root == null) {
			System.out.println("Empty Tree!!");
			return null;
		}
		while (temp.getRight() != null) {
			temp = temp.getRight();
		}

		return temp.getData();
	}

	public Integer minByRecursion() {
		BinarySearchTreeNode temp = root;
		return findMinByRecursion(temp);
	}

	private Integer findMinByRecursion(BinarySearchTreeNode root) {
		if (root == null) {
			System.out.println("Empty Tree");
			return null;
		}

		if (root.getLeft() == null)
			return root.getData();

		return findMinByRecursion(root.getLeft());
	}

	public Integer minByIteration() {
		BinarySearchTreeNode temp = root;
		if (root == null) {
			System.out.println("Empty Tree!!");
			return null;
		}
		while (temp.getLeft() != null) {
			temp = temp.getLeft();
		}

		return temp.getData();
	}

	public Integer height() {
		BinarySearchTreeNode temp = root;
		return heightOfBST(temp);
	}

	private Integer heightOfBST(BinarySearchTreeNode root) {

		if (root == null)
			return -1;

		Integer leftHeight = heightOfBST(root.getLeft());
		Integer rightHeight = heightOfBST(root.getRight());

		return max(leftHeight, rightHeight) + 1;
	}

	private Integer max(Integer a, Integer b) {
		if (a == b)
			return a;
		else if (a > b)
			return a;
		else
			return b;
	}

	public void breadthFirstTraversal() {
		Queue queue = new Queue();
		BinarySearchTreeNode binarySearchTreeNode = root;
		if (binarySearchTreeNode == null) {
			System.out.println("Empty Tree..");
			return;
		}

		queue.add(binarySearchTreeNode);

		while (!queue.isEmpty()) {
			binarySearchTreeNode = (BinarySearchTreeNode) queue.peek();
			System.out.println(binarySearchTreeNode.getData());
			if (binarySearchTreeNode.getLeft() != null)
				queue.add(binarySearchTreeNode.getLeft());
			if (binarySearchTreeNode.getRight() != null)
				queue.add(binarySearchTreeNode.getRight());
			queue.remove();
		}
	}

	public void depthFirstTraversal(Integer choice) {
		BinarySearchTreeNode binarySearchTreeNode = root;
		if (binarySearchTreeNode == null) {
			System.out.println("Empty Tree..");
			return;
		}
		switch (choice){
		case(1):
			depthFirstPreorderTraversal(binarySearchTreeNode);
			break;
		case(2):
			depthFirstInorderTraversal(binarySearchTreeNode);
			break;
		case(3):
			depthFirstPostorderTraversal(binarySearchTreeNode);
			break;
		}
	}

	private void depthFirstPreorderTraversal(BinarySearchTreeNode root) {

		if (root == null)
			return;

		System.out.println(root.getData());
		depthFirstPreorderTraversal(root.getLeft());
		depthFirstPreorderTraversal(root.getRight());
	}

	private void depthFirstInorderTraversal(BinarySearchTreeNode root) {

		if (root == null)
			return;

		depthFirstInorderTraversal(root.getLeft());
		System.out.println(root.getData());
		depthFirstInorderTraversal(root.getRight());
	}

	private void depthFirstPostorderTraversal(BinarySearchTreeNode root) {

		if (root == null)
			return;

		depthFirstPostorderTraversal(root.getLeft());
		depthFirstPostorderTraversal(root.getRight());
		System.out.println(root.getData());
	}
	
	public void delete(Integer data){
		BinarySearchTreeNode temp = root;
		deleteUtil(temp, data);
	}
	
	private BinarySearchTreeNode deleteUtil(BinarySearchTreeNode root, Integer data){
		
		if(root == null) return root;
		else if(data < root.getData())	root.setLeft(deleteUtil(root.getLeft(), data));
		else if(data > root.getData())	root.setRight(deleteUtil(root.getRight(), data));
		else {
			if (root.getLeft() == null && root.getRight() == null) root = null;
			else if(root.getLeft() == null)	root = root.getRight();
			else if(root.getRight() == null)	root = root.getLeft();
			else {
				BinarySearchTreeNode temp = findMinNode(root.getRight());
				root.setData(temp.getData());
				root.setRight(deleteUtil(root.getRight(), temp.getData()));
			}
		}
		return root;
	}
	
	private BinarySearchTreeNode findMinNode(BinarySearchTreeNode root) {
		if (root == null) {
			System.out.println("Empty Tree");
			return null;
		}

		if (root.getLeft() == null)
			return root;

		return findMinNode(root.getLeft());
	}
	
	private BinarySearchTreeNode findNode(BinarySearchTreeNode root, Integer data) {
		if (root == null)
			return null;
		else if (root.getData() == data)
			return root;
		else if (data < root.getData())
			return findNode(root.getLeft(), data);
		else
			return findNode(root.getRight(), data);
	}
	
	public Integer inorderSuccessor(Integer data){
		BinarySearchTreeNode temp = root;
		BinarySearchTreeNode current = findNode(temp, data);
		temp = root;
		if(current == null) return null;
		if(current.getRight() != null){
			return findMinByRecursion(current.getRight());
		} else {
			BinarySearchTreeNode successor = null, ancestor = temp;
			
			while(ancestor != current){
				if(current.getData() < ancestor.getData()){
					successor = ancestor;
					ancestor = ancestor.getLeft();
				} else ancestor = ancestor.getRight();
			}			
			return successor.getData();
		}
	}
}
