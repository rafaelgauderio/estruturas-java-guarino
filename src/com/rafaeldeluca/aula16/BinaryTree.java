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
			while (true) {
				if (newNode.getValue().compareTo(current.getValue()) == -1) {
					if (current.getLeft() != null) {
						current = current.getLeft();
					} else {
						current.setLeft(newNode);
						break;
					}
				} else {
					if (current.getRight() != null) {
						current = current.getRight();
					} else {
						current.setRight(newNode);
						break;
					}
				}
			}
		}
	}

	public void printInOrder(Node<T> current) {

		// imprimir esquerda, cima, direita
		if (current != null) {
			printInOrder(current.getLeft());
			System.out.print("[" + current.getValue() + "] ");
			printInOrder(current.getRight());
		}
		if (this.root == null) {
			System.out.println("The tree is empty");
		}
	}

	public void printPreOrder(Node<T> current) {
		// cima, esquerda, direita
		// primeiro a ser impresso é a raiz
		if (current != null) {
			System.out.print("[" + current.getValue() + "] ");
			printPreOrder(current.getLeft());
			printPreOrder(current.getRight());
		}
	}

	public void printPostOrder(Node<T> current) {
		// esquerda, direita, raiz
		// último a ser impresso é a raiz
		if (current != null) {
			printPostOrder(current.getLeft());
			printPostOrder(current.getRight());
			System.out.print("[" + current.getValue() + "] ");
		}
	}

	public boolean remove(T value) {
		// árvore tem que estar ordenada para fazer a busca e remover um elemento
		// mais fácil remover elementos que não tem filhos (folhas)
		// search element
		Node<T> current = this.root;
		Node<T> currentFather = null; // the root has no father
		while (current != null) {
			if (current.getValue().equals(value)) {
				break;
			} else if (value.compareTo(current.getValue()) == -1) {
				// verify if it smaller than current
				currentFather = current;
				current = current.getLeft();
			} // if it is bigger than current node
			else {
				currentFather = current;
				current = current.getRight();
			}
		}

		// check if the node exist
		if (current != null) {
			// check if the node has to sons or just son on right
			// if ((current.getLeft() != null && current.getRight() != null) ||
			// current.getRight() != null) {
			if (current.getRight() != null) {

				Node<T> substitute = current.getRight();
				Node<T> substituteFather = current;
				while (substitute.getLeft() != null) {
					substituteFather = substitute;
					substitute = substitute.getLeft();
				}
				substitute.setLeft(current.getLeft());
				if (currentFather != null) {
					if (current.getValue().compareTo(currentFather.getValue()) == -1) {
						// if current < currentFather
						currentFather.setLeft(substitute);
					} else {
						currentFather.setRight(substitute);
					}
				} else {
					// if current has no father, the node is the root
					this.root = substitute;
					substituteFather.setLeft(null);
					this.root.setRight(substituteFather);
					this.root.setLeft(current.getLeft());
				}
				// remove node from tree
				if (substitute.getValue().compareTo(substituteFather.getValue()) == -1) {
					// substitute < substituteFather
					substituteFather.setLeft(null);
				} else {
					substituteFather.setRight(null);
				}
			} else if (current.getLeft() != null) {
				// has son just on left
				Node<T> substitute = current.getLeft();
				Node<T> substituteFather = current;
				while (substitute.getRight() != null) {
					substituteFather = substitute;
					substitute = substitute.getRight();
				}
				if (currentFather != null) {
					if (current.getValue().compareTo(currentFather.getValue()) == -1) {
						// current < currentFather
						currentFather.setLeft(substitute);
					} else {
						currentFather.setRight(substitute);
					}
				} else {
					// if is the root
					this.root = substitute;
				}
				// remove elemento from tree
				if (substitute.getValue().compareTo(substituteFather.getValue()) == -1) {
					substituteFather.setLeft(null);
				} else {
					substituteFather.setRight(null);
				}
			} else {
				// has no sons
				if (currentFather != null) {
					if (current.getValue().compareTo(currentFather.getValue()) == -1) {
						// current < currentFather
						currentFather.setLeft(null);
					} else {
						currentFather.setRight(null);
					}
				} else {
					// it is the root
					this.root = null;
				}
			}
			return true;
		} else {
			return false;
		}
	}

}
