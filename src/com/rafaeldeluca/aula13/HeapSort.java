package aula13;

public class HeapSort {

	// complexity O(n.log n)
	private static int swaps = 0;

	int size = swaps = 0;

	private static void heapSort(int[] array, int size, int i) {
		int root = i, left = 2 * i + 1, right = 2 * i + 2;
		if (left < size && array[left] > array[root]) {
			root = left;
		}
		if (right < size && array[right] > array[root]) {
			root = right;
		}
		if (root != i) {
			int aux = array[i];
			array[i] = array[root];
			array[root] = aux;
			swaps++;

			heapSort(array, size, root);
		}

	}

	public static Result sort(int[] array) {

		int size = array.length;
		for (int i = size / 2 - 1; i >= 0; i--) {
			heapSort(array, size, i);
		}
		for (int j = size - 1; j > 0; j--) {
			int aux = array[0];
			array[0] = array[j];
			array[j] = aux;
			swaps++;
			heapSort(array, j, 0);
		}
		return new Result(swaps, array);

	}

}
