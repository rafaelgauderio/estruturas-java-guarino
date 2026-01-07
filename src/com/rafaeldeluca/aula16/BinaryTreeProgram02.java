package aula16;

public class BinaryTreeProgram02 {

	public static void main(String[] args) {
		BinaryTree<Integer> tree = new BinaryTree<Integer>();

		tree.add(10);
		tree.add(8);
		tree.add(6);
		tree.add(9);
		tree.add(7);
		tree.add(15);
		tree.add(12);
		tree.add(25);

		System.out.println("\nPrint Binary Tree in-order");
		tree.printInOrder(tree.getRoot());

		tree.remove(25);
		tree.remove(12);
		tree.remove(7);

		System.out.println("\nPrint in-order after removing nodes that have nos sons");
		tree.printInOrder(tree.getRoot());
		
		tree.remove(8);
		System.out.println("\nPrint ir-order after removing nodes that have left and right sons");
		tree.printInOrder(tree.getRoot());
		
		tree.remove(6);
		tree.remove(9);
		tree.remove(15);
		System.out.println("\nPrint just the root");
		tree.printInOrder(tree.getRoot());
		
		tree.remove(10);
		System.out.println("\nPrint after remove only the root");
		tree.printInOrder(tree.getRoot());

	}

}
