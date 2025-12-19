package aula13;

public class QuickSort {

	// complexity O(N.logN) in the average case

	static int swaps = 0;

	private static int partition(int[] array, int low, int high) {
		int middle = (int) (low + high) / 2;
		int pivot = array[middle];
		int i = low - 1;
		int j = high;
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
			swaps++;
		}
	}

	public static Result sort(int[] array, int low, int high) {
		if (low < high) {
			int pivot = partition(array, low, high);
			sort(array, low, pivot);
			sort(array, pivot + 1, high);
		}

		return new Result(swaps, array);
	}
}
