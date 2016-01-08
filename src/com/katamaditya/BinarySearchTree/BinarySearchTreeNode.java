/**
 * 
 */
package com.katamaditya.BinarySearchTree;

/**
 * @author VeeraSivaSriAditya
 *
 */
public class BinarySearchTreeNode {

	private Integer data;
	
	private BinarySearchTreeNode right;
	
	private BinarySearchTreeNode left;

	public BinarySearchTreeNode(Integer data) {
		super();
		this.data = data;
		this.right = null;
		this.left = null;
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public BinarySearchTreeNode getRight() {
		return right;
	}

	public void setRight(BinarySearchTreeNode right) {
		this.right = right;
	}

	public BinarySearchTreeNode getLeft() {
		return left;
	}

	public void setLeft(BinarySearchTreeNode left) {
		this.left = left;
	}

}
