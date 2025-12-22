package aula15;

import java.util.Iterator;
import java.util.Stack;

public class StackAPIProgram {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();

		stack.push("Lithium");
		stack.push("Postassium");
		stack.push("Iron");
		stack.push("Calcium");
		stack.push("Magnesium");

		System.out.println("Current Stack: " + stack);
		System.out.println("Top: " + stack.peek());

		Iterator<String> iterator = stack.iterator();
		System.out.println("Printing using iterator");
		while (iterator.hasNext()) {
			System.out.println("Element: " + iterator.next());
		}

		System.out.println("Remove from top: " + stack.pop());
		System.out.println("Remove from top: " + stack.pop());
		stack.add("Nitrogen");

		System.out.println("\nStack after remove and add: " + stack);

		stack.clear();
		System.out.println("Is Stack empty: " + stack.isEmpty());

	}

}
