package cs_300_lab_3;

public class BTreeNode<T> {
	private BTreeNode<T> leftNode;
	private BTreeNode<T> rightNode;
	private T value;
	
	public BTreeNode() {
		this.value = null;
		this.leftNode = null;
		this.rightNode = null;
	}
	
	public BTreeNode(T value) {
		this.value = value;
		this.leftNode = null;
		this.rightNode = null;
	}
	
	public BTreeNode(T value, BTreeNode<T> leftNode) {
		this.value = value;
		this.leftNode = leftNode;
		this.rightNode = null;
	}
	
	public BTreeNode(T value, BTreeNode<T> leftNode, BTreeNode<T> rightNode) {
		this.value = value;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}
	
	public BTreeNode<T> getLeftChild() {
		return leftNode;
	}
	
	public BTreeNode<T> getRightChild() {
		return rightNode;
	}
	
	public void setLeftChild(BTreeNode<T> node) {
		leftNode = node;
	}
	
	public void setRightChild(BTreeNode<T> node) {
		rightNode = node;
	}
	
	public boolean hasChildren() {
		return leftNode != null || rightNode != null;
	}
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
}
