package aula15;

public class StackProgram {

	public static void main(String[] args) {

		System.out.println("Pilha é um tipo abstrado de dado.\n"
				+ "Define um conjunto de operações, independente de como essas operações são implementadas.\n"
				+ "LIFO (Last-in - First-Out");

		StackPersonal stack = new StackPersonal();
		stack.addOnTop("Rafael");
		stack.addOnTop("João");
		stack.addOnTop("Laura");
		stack.addOnTop("Helena");
		stack.addOnTop("Atena");

		for (int i = 0; i < stack.getSize(); i++) {
			System.out.println("Element: " + stack.get(i).getValue());
		}
		System.out.println("Top: " + stack.get());

		stack.removeFromTop();
		stack.removeFromTop();
		stack.addOnTop("String on top");

		System.out.println("Print after remove and add");
		for (int i = 0; i < stack.getSize(); i++) {
			System.out.println("Element: " + stack.get(i).getValue());
		}

	}

}
