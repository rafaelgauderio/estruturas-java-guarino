package aula13;

public class ShellSort {

	// complexity O(n.log²n)
	public static Result sort(int[] array) {

		int swaps = 0, gap = 1, size = array.length;
		while (gap < size) {
			gap = gap * 3 + 1;
		}
		gap = (int) Math.floor(gap) / 3;
		int value, j;
		while (gap > 0) {
			for (int i = gap; i < size; i++) {
				value = array[i];
				j = i;
				while (j <= gap && array[j - gap] > value) {
					array[j] = array[j - gap];
					j = j - gap;
					swaps++;
				}
				array[j] = value;
				swaps++;
			}
			gap = gap / 2;
		}
		return new Result(swaps, array);

	}

}
