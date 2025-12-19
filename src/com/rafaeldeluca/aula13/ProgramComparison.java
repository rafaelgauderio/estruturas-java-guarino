package aula13;

public class ProgramComparison {

	public static void main(String[] args) {

		long start, end;
		Result result;

		int[] unsortedArray = createArray(15);
		System.out.println("\nBuble Sort");
		printArray(unsortedArray);
		start = System.currentTimeMillis();
		result = BubbleSort.sort(unsortedArray.clone());
		end = System.currentTimeMillis();		
		printArray(result.getArray());
		System.out.println("Total swapps: " + result.getSwaps());
		System.out.println("Time (miliseconds): " + (end - start));
		
		System.out.println("\nInsertion Sort");
		printArray(unsortedArray);
		start = System.currentTimeMillis();
		result = InsertionSort.sort(unsortedArray.clone());
		end = System.currentTimeMillis();		
		printArray(result.getArray());
		System.out.println("Total swapps: " + result.getSwaps());
		System.out.println("Time (miliseconds): " + (end - start));
		
		System.out.println("\nSelection Sort");
		printArray(unsortedArray);
		start = System.currentTimeMillis();
		result = SelectionSort.sort(unsortedArray.clone());
		end = System.currentTimeMillis();		
		printArray(result.getArray());
		System.out.println("Total swapps: " + result.getSwaps());
		System.out.println("Time (miliseconds): " + (end - start));
		
		System.out.println("\nSelection Sort");
		printArray(unsortedArray);
		start = System.currentTimeMillis();
		result = SelectionSort.sort(unsortedArray.clone());
		end = System.currentTimeMillis();		
		printArray(result.getArray());
		System.out.println("Total swapps: " + result.getSwaps());
		System.out.println("Time (miliseconds): " + (end - start));
		
		System.out.println("\nShell Sort");
		printArray(unsortedArray);
		start = System.currentTimeMillis();
		result = ShellSort.sort(unsortedArray.clone());
		end = System.currentTimeMillis();		
		printArray(result.getArray());
		System.out.println("Total swapps: " + result.getSwaps());
		System.out.println("Time (miliseconds): " + (end - start));
		
		System.out.println("\nHeap Sort");
		printArray(unsortedArray);
		start = System.currentTimeMillis();
		result = HeapSort.sort(unsortedArray.clone());
		end = System.currentTimeMillis();		
		printArray(result.getArray());
		System.out.println("Total swapps: " + result.getSwaps());
		System.out.println("Time (miliseconds): " + (end - start));
		
		System.out.println("\nQuick Sort");
		printArray(unsortedArray);
		start = System.currentTimeMillis();
		result = QuickSort.sort(unsortedArray.clone(), 0, unsortedArray.length);
		end = System.currentTimeMillis();		
		printArray(result.getArray());
		System.out.println("Total swapps: " + result.getSwaps());
		System.out.println("Time (miliseconds): " + (end - start));

	}

	public static int[] createArray(int size) {
		int max = 100, min = 1, range = max - min + 1;
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * range) + 1;
		}
		return array;
	}

	public static void printArray(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print("[" + vector[i] + "] ");
		}
		System.out.println();
	}

}
