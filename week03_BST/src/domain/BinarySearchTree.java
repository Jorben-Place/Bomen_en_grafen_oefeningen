package domain;

public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E> {

	public BinarySearchTree(E data, BinarySearchTree<E> leftTree, BinarySearchTree<E> rightTree) {
		super(data, leftTree, rightTree);
	}
			
	public BinarySearchTree(E data) {
		super(data);
	}

	public boolean lookup(E data) {
		if (data == null)
			return false;
		if(data.compareTo(this.data) == 0)
			return true;
		else
		if(data.compareTo(this.data) == -1)
			if(leftTree == null)
				return false;
			else
				return leftTree.lookup(data);
		if(rightTree == null)
			return false;
		else
			return rightTree.lookup(data);
	}

	public boolean addNode(E data) {
		if (data == null) {
			throw new IllegalArgumentException("");
		}
		if(data.compareTo(this.data) == 0) {
			return false;
		} else if(data.compareTo(this.data) == -1) {
			if (leftTree == null) {
				this.leftTree = new BinarySearchTree<>(data);
				return true;
			} else return (this.leftTree.addNode(data));
		} else if(rightTree == null) {
			if (rightTree == null)
				this.rightTree = new BinarySearchTree<>(data);
			return true;
		}else return (this.rightTree.addNode(data));
	}

	public boolean removeNode(E data){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public E searchSmallest(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public E searchGreatest(){
		throw new UnsupportedOperationException("Not yet implemented");
	}
}


