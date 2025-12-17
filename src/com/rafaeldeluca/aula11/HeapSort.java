package aula11;

public class HeapSort {

	public static void main(String[] args) {

		System.out.println("É um algoritmo de seleção, tipo o Selection Sort\n"
				+ "É um tipo de árvore binária especial em que o elemento pai é maior que elemento a esquerda e a direira.\n"
				+ "Tem duas fases: na primeira, transforma o arrau em um heap máximo (elemento pai sempre maior que os filhos);\n"
				+ "\tna segunda, extrao o maior elemento repetidamente, trocando-o com último.\n"
				+ "Ordena 'in place', não estável\n"
				+ "Tem complexidade O(n.log n)\n");

		heapSort(createVector(19));
		heapSort(createVector(100));
		heapSort(createVector(1000));
		heapSort(createVector(10000));
		heapSort(createVector(100000));
		heapSort(createVector(1000000));
		heapSort(createVector(10000000));
		heapSort(createVector(100000000));
	}

	private static int[] createVector(int size) {
		int max = 80, min = 1, range = max - min + 1;
		int[] vector = new int[size];

		for (int w = 0; w < vector.length; w++) {
			vector[w] = (int) (Math.random() * range) + 1;
		}

		if (size < 20) {
			System.out.println("UNSORTED vector");
			for (int w = 0; w < vector.length; w++) {
				System.out.print("[" + vector[w] + "] ");
			}
			System.out.println();
		}

		return vector;
	}

	private static void heapfication(int[] vector, int size, int i) {

		// heapificar uma subárvore enraizada em i
		int root = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		if (left < size && (vector[left] > vector[root])) {
			root = left;
		}
		if (right < size && (vector[right] > vector[root])) {
			root = right;
		}
		if (root != i) {
			int aux = vector[i];
			vector[i] = vector[root];
			vector[root] = aux;
			heapfication(vector, size, root);
		}

	}

	public static void heapSort(int vector[]) {
		int size = vector.length;
		long initialTime = System.currentTimeMillis(), finalTime = 0;
		// construir um max heap
		for (int i = size / 2 - 1; i >= 0; i--) {
			heapfication(vector, size, i);
		}		
		// extrari elementos do heap um a um
		// mover a root (maior elemento) para o final
		for (int i = size - 1; i > 0; i--) {
			int aux = vector[0];
			vector[0] = vector[i];
			vector[i] = aux;
			heapfication(vector, i, 0);
		}
		finalTime = System.currentTimeMillis();

		System.out.println(
				((finalTime - initialTime) + " mili seconds to order a vector with of " + size + " elements."));
		if (size < 20) {
			System.out.println("ORDERED vector");
			for (int initial = 0; initial < vector.length; initial++) {
				System.out.print("[" + vector[initial] + "] ");
			}
			System.out.println("\n");
		}
		

	}

}
