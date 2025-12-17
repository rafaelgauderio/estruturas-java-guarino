package aula12;

public class QuickSort {

	public static void main(String[] args) {

		System.out.println("Utiliza a técnica de 'dividir para conquistar', através de um pivot\n"
				+ "Elementos menores à esquerda e maiores à direita, e ordenando recursivimente cada sub-parte.\n"
				+ "In place, não estável, o desempenho depende de uma boa escolha do pivot.\n"
				+ "Complecidade O(n.logn) no caso médio e O(n²) no pior caso.");

		printOrderArray(quickSort(createVector(25), 0, 24));
	}

	private static int[] createVector(int size) {
		int max = 50, min = 1, range = max - min + 1;
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * range) + 1;
		}
		if (size < 30) {
			System.out.println("\nUNSORTED vector");
			for (int i = 0; i < array.length; i++) {
				System.out.print("[" + array[i] + "] ");
			}
			System.out.println();
		}
		return array;

	}

	private static int partition(int[] array, int left, int right) {
		// começa o pivot no meio do array
		int size = array.length;
		int pivot = array[(int) (left + right) / 2];
		int i = left - 1;
		int j = right + 1;
		// quando os pivos se entragem encerra o laço
		while (true) {
			do {
				i++;
			} while (array[i] < pivot);
			do {
				j--;
			} while (array[j] > pivot);
			if (i >= j) {
				return j;
			}
			int aux = array[i];
			array[i] = array[j];
			array[j] = aux;

		}

	}

	private static int[] quickSort(int[] array, int left, int right) {

		if (left < right) {
			int pivot = partition(array, left, right);
			quickSort(array, left, pivot);
			quickSort(array, pivot + 1, right);
		}

		return array;
	}

	private static void printOrderArray(int[] array) {
		int size = array.length;
		if (size < 30) {
			System.out.println("ORDERED vector");
			for (int i = 0; i < array.length; i++) {
				System.out.print("[" + array[i] + "] ");
			}
			System.out.println("\n");
		}
	}

}
