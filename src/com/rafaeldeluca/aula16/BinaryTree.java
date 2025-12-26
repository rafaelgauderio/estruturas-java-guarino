package aula16;

public class BinaryTree<T extends Comparable<T>> {

	private Node<T> root;

	public BinaryTree() {
		this.root = null;

	}	
	

	public Node<T> getRoot() {
		return root;
	}


	public void add(T value) {

		Node<T> newNode = new Node<T>(value);

		if (root == null) {
			this.root = newNode;
		} else {
			Node<T> current = this.root;
			while(true) {
				if(newNode.getValue().compareTo(current.getValue()) == -1) {
					if(current.getLeft() != null) {
						current = current.getLeft();
					} else {
						current.setLeft(newNode);
						break;
					}
				} else {
					if(current.getRight() != null) {
						current = current.getRight();
					} else {
						current.setRight(newNode);
						break;
					}
				}
			}
		}
	}

}
