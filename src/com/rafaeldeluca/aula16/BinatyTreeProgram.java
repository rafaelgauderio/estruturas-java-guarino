package aula16;

public class BinatyTreeProgram {

	public static void main(String[] args) {

		BinaryTree<Integer> tree = new BinaryTree<Integer>();
		tree.add(17);
		tree.add(12);
		tree.add(9);
		tree.add(13);
		tree.add(10);
		tree.add(21);
		tree.add(18);
		tree.add(25);

		System.out.println("\nÉ uma estrutura de dados organizada em níveis, que tem a raiz no topo."
				+ "\nCada elemento é um nó, que tem um valor e um ponteiro para seus nós filhos."
				+ "\nCada nó pode ter zero ou 2 filhos." + "\nFolhas são os nós sem filhos.\n");

		System.out.println("\nExitem 3 maneiras de percorrer uma árvore:"
				+ "\nPercorrer a árvore em-ordem é na seguinte sequência: esquerda, cima, direita"
				+ "\n\tImpresso na ordem crescente."
				+ "\nPercorrer na pré-ordem é na seguinte sequência: cima, esquerda, direita."
				+ "\n\tPrimeiro a ser impresso é a raiz"
				+ "\nPercorrer na pós-ordem é na sequinte sequência: esquerda, direita, cima."
				+ "\n\tÚltimo a ser impresso é a raiz");

		System.out.println("Root: " + tree.getRoot().getValue());

		System.out.println("\nPrint Binary Tree in-order");
		tree.printInOrder(tree.getRoot());

		System.out.println("\nPrint Binary Tree pre-order");
		tree.printPreOrder(tree.getRoot());

		System.out.println("\nPrint Binary Tree post-order");
		tree.printPostOrder(tree.getRoot());

		
	}
}
