package aula8;

public class SelectionSort {

	public static void main(String[] args) {

		System.out.println("Simples, in-place (não necessita de um array auxiliar), realiza poucas trocas.\n"
				+ "Não estável (pode não preservar a ordem de valores iguais.\n"
				+ "Divide a lista em duas partes, repeditamente encontrando o menor elemento da seção não ordenada\n"
				+ "\te trocando para o início da seção ordenada.\n"
				+ "Em suma, encontrar o menor elemento e colocar na posição certa.\n"
				+ "No pior caso tem complexidade O(n²)\n");

		selectionSort(15);
		selectionSort(100);
		selectionSort(1000);
		selectionSort(10000);
		selectionSort(100000);
	}

	public static int[] selectionSort(int size) {

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

		// selection sort
		int smallestIndex;
		for (int i = 0; i < vector.length; i++) {
			smallestIndex = i;
			for (int j = i + 1; j < vector.length; j++) {
				if (vector[j] < vector[smallestIndex]) {
					// apenas quarda a posição do menor valor
					// só vai fazer a troca quando sair do for (percorrer todo o vetor)
					smallestIndex = j;
				}
			}
			int aux = vector[smallestIndex];
			vector[smallestIndex] = vector[i];
			vector[i] = aux;
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
