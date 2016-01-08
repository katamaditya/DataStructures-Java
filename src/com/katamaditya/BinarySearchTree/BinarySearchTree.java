/**
 * 
 */
package com.katamaditya.BinarySearchTree;

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
	
	public void insert(Integer data){
		BinarySearchTreeNode temp = root;
		this.root = insert(temp, data);
	}
	
	public boolean search(Integer data){
		BinarySearchTreeNode temp = root;
		return searchInBST(temp, data);
	}
	
	private BinarySearchTreeNode insert(BinarySearchTreeNode root, Integer data){
		
		if(root == null){
			root = new BinarySearchTreeNode(data);
		}else if(data <= root.getData()){
			root.setLeft(insert(root.getLeft(), data));
		} else {
			root.setRight(insert(root.getRight(), data));
		}		
		return root;
	}
	
	private boolean searchInBST(BinarySearchTreeNode root, Integer data){
		if(root == null) return false;
		else if (root.getData() == data) return true;
		else if (data < root.getData()) return searchInBST(root.getLeft(), data);
		else return searchInBST(root.getRight(), data);
	}
	
	public Integer maxByRecursion(){
		BinarySearchTreeNode temp = root;
		return findMaxByRecursion(temp);
	}
	
	private Integer findMaxByRecursion(BinarySearchTreeNode root){		
		if (root == null){
			System.out.println("Empty Tree");
			return null;
		}
		
		if(root.getRight() == null) return root.getData();
		
		return findMaxByRecursion(root.getRight());
	}
	
	public Integer maxByIteration(){
		BinarySearchTreeNode temp = root;
		if (root == null){
			System.out.println("Empty Tree!!");
			return null;
		}
		while(temp.getRight() != null){
			temp = temp.getRight();
		}
		
		return temp.getData();
	}
	
	public Integer minByRecursion(){
		BinarySearchTreeNode temp = root;
		return findMinByRecursion(temp);
	}
	
	private Integer findMinByRecursion(BinarySearchTreeNode root){		
		if (root == null){
			System.out.println("Empty Tree");
			return null;
		}
		
		if(root.getLeft() == null) return root.getData();
		
		return findMaxByRecursion(root.getLeft());
	}
	
	public Integer minByIteration(){
		BinarySearchTreeNode temp = root;
		if (root == null){
			System.out.println("Empty Tree!!");
			return null;
		}
		while(temp.getLeft() != null){
			temp = temp.getLeft();
		}
		
		return temp.getData();
	}
	
	public Integer height(){
		BinarySearchTreeNode temp = root;
		return heightOfBST(temp);
	}
	
	private Integer heightOfBST(BinarySearchTreeNode root){
		
		if(root == null) return -1;
		
		Integer leftHeight = heightOfBST(root.getLeft());
		Integer rightHeight = heightOfBST(root.getRight());
		
		return max(leftHeight, rightHeight)+1;
	}
	
	private Integer max(Integer a, Integer b){
		if (a==b) return a;
		else if (a>b) return a;
		else return b;
	}
}
