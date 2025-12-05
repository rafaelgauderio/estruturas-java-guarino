package aula5;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		int[] vector = new int[100];
		
		// prencher o vetor
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * 100);
			System.out.println("index: " + i + ", value: " + vector[i]);
		}

		System.out.println("Enter the value do you want to search for in the vector?");
		Scanner sc = new Scanner(System.in);
		int valueSought = sc.nextInt();
		boolean find = false;
		for (int j = 0; j < vector.length; j++) {
			if (vector[j] == valueSought) {
				find = true;
				break;
			}
		}
		if (find == true) {
			System.out.println("value found");
		} else {
			System.out.println("value NOT found");
		}
		sc.close();
		
		System.out.println("\nLinear Search has O(n) complexity");
	}

}
