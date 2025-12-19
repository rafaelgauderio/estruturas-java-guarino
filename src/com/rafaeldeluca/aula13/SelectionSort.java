package aula13;

public class SelectionSort {

	public static Result sort(int[] array) {

		// complexity O(n²)
		int swaps = 0, aux, lowest_position;
		for (int i = 0; i < array.length; i++) { // O(n)
			lowest_position = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[lowest_position]) {
					lowest_position = j;
				}
			}
			aux = array[lowest_position];
			array[lowest_position] = array[i];
			array[i] = aux;
			swaps++;
		}
		return new Result(swaps, array);
	}

}
