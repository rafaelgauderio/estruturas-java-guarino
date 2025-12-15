package aula10;

public class ShellSort {

	public static void main(String[] args) {
		System.out.println("Shell Sort\n" + "Melhora o insertion Sort, pois permite trocas de elementos distantes.\n"
				+ "Eficiente para dados médios, implmentação simples, não estável.\n"
				+ "Complexidade variável de acordo com o gap escolhido,\n"
				+ "\tmas a complexidade média é melhor que O(n²). Proxima de O(n.log²n)\n");

		shellSort(15);
		shellSort(100);
		shellSort(1000);
		shellSort(10000);
		shellSort(100000);
		shellSort(1000000);

	}

	public static int[] shellSort(int size) {

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

		// shell sort
		int gap = 1;
		while (gap < size) {
			gap = gap * 3 + 1;
		}
		// arredondando para baixo
		gap = (int) Math.floor(gap / 3);
		int element, j;
		while (gap > 0) {
			for (int i = gap; i < size; i++) {
				element = vector[i];
				j = i;
				while (j >= gap && vector[j - gap] > element) {
					vector[j] = vector[j - gap];
					j = j - gap;
				}
				vector[j] = element;
			}
			gap = gap / 2;
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
