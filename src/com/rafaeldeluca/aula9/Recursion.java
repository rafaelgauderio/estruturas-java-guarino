package aula9;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Recursion {

	public static void main(String[] args) {

		System.out.println("É uma técnica onde um algoritmo resolve um problema chamando a si mesmo,\n"
				+ "\tcom uma versao menor do problema original, até atingir uma condição de parada\n"
				+ " \t(para evitar um loop infinito)\n");

		double[] vector = new double[20];
		System.out.println("Print vector");
		for (int i = 0; i < vector.length; i++) {
			vector[i] = Math.random() * vector.length;
			System.out.print(String.format("[%.2f]", vector[i]));
		}

		StringBuilder result = new StringBuilder();
		result.append("\nSum of the vector: ");
		BigDecimal bd = new BigDecimal(sum(0, 0, vector)).setScale(2, RoundingMode.HALF_EVEN);
		result.append(bd);
		System.out.println(result);

		try {
			System.out.println("Mathematical Product of 3: " + mathematicalProduct(3));
			System.out.println("Mathematical Product of 4: " + mathematicalProduct(4));
			System.out.println("Mathematical Product of 5: " + mathematicalProduct(5));
			System.out.println("Mathematical Product of 20: " + mathematicalProduct(20));
			System.out.println("Mathematical Product of 20: " + mathematicalProduct(-10));
			System.out.println("Mathematical Product of 20: " + mathematicalProduct(6));
		} catch (IllegalArgumentException exception) {
			System.out.println("Error of illegal argument: " + exception.getMessage());
		}

	}

	public static double sum(double partialSum, int index, double[] vector) {
		if (index <= vector.length - 1) { // vai acumulando até chegar na ultima posição do vetor
			partialSum += vector[index];
			return sum(partialSum, index + 1, vector);
		} else {
			return partialSum; // condição de parada;
		}
	}

	public static long mathematicalProduct(int upperLimit) {
		if (upperLimit < 0) {
			throw new IllegalArgumentException("Number can not be lessa than zero");
		}
		if (upperLimit <= 1) {
			return 1;
		} else {
			return upperLimit * mathematicalProduct(upperLimit - 1);
		}

	}

}
