package aula13;

public class BubbleSort {

	// complexiti O(n²)
	public static Result sort(int[] array) {
		int swaps = 0, aux;
		for (int i = 0; i < array.length; i++) { // O(n)
			for (int j = i + 1; j < array.length; j++) { // O(n)
				if (array[i] > array[j]) {
					aux = array[j];
					array[j] = array[i];
					array[i] = aux;
					swaps++;
				}
			}
		}
		return new Result(swaps, array);
	}

}
