package aula3;

public class ProgramLinkedList {

	public static void main(String[] args) {

		System.out.println("Cada elemento sabe apenaso seu valor e quem é o seu próximo elemento."
				+ "\n\tApenas 1 ponteiro para o próximo elemento."
				+ "\n\tA lista ligada só sabe quem é o primeiro elemento e quem é o último"
				+ "\n\tMais fácil de adicionar e remover elementos."
				+ "\n\tPara encontar um elemento tem que percorrer a lista inteira."
				+ "\n\tNão tem como fazer acesso direto pelo index do elemento."
				+ "\n\tLinkedList é a lista ligada nativa do java\n");

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.addElement("Tablet");

		System.out.println("Size:" + linkedList.getListSize());
		System.out.println("First Element: " + linkedList.getFirst().getValue());

		linkedList.addElement("Notebook");
		linkedList.addElement("Phone");
		linkedList.addElement("Mouse");
		linkedList.addElement("Keyboard");
		linkedList.addElement("Pendrive");

		System.out.println("Size: " + linkedList.getListSize());
		System.out.println("First:" + linkedList.getFirst().getValue());
		System.out.println("Last:" + linkedList.getLast().getValue());

		System.out.println("\nImprimindo toda a lista");
		for (int i = 0; i < linkedList.getListSize(); i++) {
			System.out.println(linkedList.get(i).getValue());
		}

		linkedList.removeElement("Keyboard");
		linkedList.removeElement("Phone");
		linkedList.removeElement("Tablet");
		linkedList.removeElement("Notebook");
		linkedList.removeElement("Pendrive");
		linkedList.removeElement("Mouse");

		System.out.println("\nImprimindo a lista após as remoções");
		System.out.println("Size: " + linkedList.getListSize());
		for (int j = 0; j < linkedList.getListSize(); j++) {
			System.out.println(linkedList.get(j).getValue());
		}

		System.out.println("\nImprimindo toda a lista");
		linkedList.addElement("Lithium Battery");
		linkedList.addElement("Nobreak");		
		for (int j = 0; j < linkedList.getListSize(); j++) {
			System.out.println(linkedList.get(j).getValue());
		}
		
		System.out.println("\nLinkedList of Students");
		LinkedList<Student> students = new LinkedList<Student>();
		students.addElement(new Student(1712,"Rafael de Luca"));
		students.addElement(new Student(1512,"Claudia de Luca"));
		students.addElement(new Student(2745,"Larissa Van der Lee"));
		for(int i=0; i < students.getListSize() ; i++) {
			System.out.println(students.get(i).getValue());
		}
		
	}

}
