package aula6;

public class BubbleSort {

	public static void main(String[] args) {

		System.out.println("Efeciente para ordenar vetores com poucos elementos.\n"
				+ "Utiliza comparação de Adjacentes, simples e ineficiente.\n"
				+ "Existe um versão otimizada usando um flag que passa a ter Complexidade O(n).\n"
				+ "Complexidade de O(n²) no pior caso.\n");

		// printVector(vector);

		int[] vector = new int[10];

		bubbleSort(10);
		bubbleSort(100);
		bubbleSort(1000);
		bubbleSort(10000);
		bubbleSort(100000);

	}

	public static int[] bubbleSort(int size) {

		int[] vector = new int[size];
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * vector.length);
		}
		if (size <= 20) {
			System.out.println("UNSORTED vector");
			for (int i = 0; i < vector.length; i++) {
				System.out.print("[" + vector[i] + "] ");
			}
		}
		long initialTime = System.currentTimeMillis(), finalTime = 0;
		int aux;
		// ordenando o vetor
		for (int i = 0; i < vector.length; i++) { // O(n)
			for (int j = i + 1; j < vector.length; j++) {
				if (vector[i] > vector[j]) {
					aux = vector[j];
					vector[j] = vector[i];
					vector[i] = aux;
				}
			}
		}
		finalTime = System.currentTimeMillis();

		if (size <= 20) {
			System.out.println("\nSORTED vector");
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
