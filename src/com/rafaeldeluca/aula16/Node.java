package aula16;

public class Node<T> {

	private T value;
	private Node<T> left;
	private Node<T> right;

	public Node(T newValue) {
		this.value = newValue;
		this.left = null;
		this.right = null;
	}
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getLeft() {
		return left;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public Node<T> getRight() {
		return right;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}
	
	

}
