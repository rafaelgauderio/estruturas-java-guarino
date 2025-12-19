package aula13;

public class InsertionSort {

	public static Result sort(int[] array) {
		// complexit O(n²)
		int swaps = 0, j, aux;
		for (int i = 1; i < array.length; i++) {
			aux = array[i];
			j = i - 1;
			while (j >= 0 && array[j] > aux) {
				array[j + 1] = array[j];
				j--;
				swaps++; // O(n)
			}
			array[j + 1] = aux;
			swaps++; // O(n)
		}
		return new Result(swaps, array);

	}

}
