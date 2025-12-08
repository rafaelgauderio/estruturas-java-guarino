package aula5;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		System.out
				.println("Vetor precisa estar ordenado na busca binária." + "\n\tDivide ao meio o vetor após cada busca"
						+ "\n\tDefinido início, meio e fim da busca" + "\n\tMuito mais eficiente que a busca linear"
								+ "\n\tComplexidade O(log n)");

		System.out.println("\nEnter the number you are searching?");
		Scanner sc = new Scanner(System.in);
		int searched = sc.nextInt();

		System.out.println("10 Elementos vector");
		binarySearch(searched, 10);
		System.out.println("100 Elementos vector");
		binarySearch(searched, 100);
		System.out.println("1000 Elementos vector");
		binarySearch(searched, 1000);
		System.out.println("10000 Elementos vector");
		binarySearch(searched, 10000);
		System.out.println("100000 Elementos vector");
		binarySearch(searched, 100000);
		System.out.println("1000000 Elementos vector");
		binarySearch(searched, 1000000);

		sc.close();
	}

	public static int binarySearch(int searched, int size) {
		int[] vector = new int[size];
		boolean find = false;
		int start = 0, half = 0, end = vector.length - 1;
		int counter = 0;
		//System.out.println("Printing vector");
		for (int i = 0; i < vector.length; i++) {
			vector[i] = 2 * i;
			//System.out.print("[" + vector[i] + "] ");
		}

		while (start <= end) {
			half = (int) ((start + end) / 2);
			counter++; // cada vez que divide o vetor, conta uma tentativa
			if (vector[half] == searched) {
				find = true;
				break;
			} else if (vector[half] < searched) {
				start = half + 1;
			} else if (vector[half] > searched) {
				end = half - 1;
			}
		}
		System.out.println("How many attempts (divisions): " + counter);
		if (find == true) {
			System.out.println("Element: " + searched + " Find\n");
		} else {
			System.out.println("Element: " + searched + " NOT Find\n");
		}

		return searched;
	}

}
