package aula7;

public class InsertionSort {

	public static void main(String[] args) {

		System.out.println("Um pouco mais perfomartico que o Bubble Sort.\n"
				+ "Analogia de colocar as cartas de um barulho em ordem crescente.\n"
				+ "Divide a lista em uma parte ordenada e outra não ordenada, inserindo iterativamente\n"
				+ "\tcada elemento da parte não ordenada na posição correta na parte ordenada.\n"
				+ "Complexidade O(n²) no pior caso\n");

		insertionSort(15);
		insertionSort(100);
		insertionSort(1000);
		insertionSort(10000);
		insertionSort(100000);
	}

	public static int[] insertionSort(int size) {

		int max = 50, min = 1, range = max - min + 1;

		int[] vector = new int[size];
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * range) + 1;
		}
		if (size < 20) {
			System.out.println("UNSORTED vector");
			for (int i = 0; i < vector.length; i++) {
				System.out.print("[" + vector[i] + "] ");
			}
		}

		long initialTime = System.currentTimeMillis(), finalTime = 0;
		// inicia em 1 pq, vetor de uma item não precisa ordenar
		int j, aux;
		for (int i = 1; i < vector.length; i++) {
			aux = vector[i];
			j = i - 1;
			while (j >= 0 && vector[j] > aux) {
				vector[j + 1] = vector[j];
				j--;
			}
			vector[j + 1] = aux;
		}

		finalTime = System.currentTimeMillis();
		if (size < 20) {
			System.out.println("\nORDERED vector");
			for (int i = 0; i < vector.length; i++) {
				System.out.print("[" + vector[i] + "] ");
			}

			System.out.println("\n");
		}
		System.out.println(
				((finalTime - initialTime) + " mili seconds to order a vector with of " + size + " elements."));

		return vector;

	}

}
