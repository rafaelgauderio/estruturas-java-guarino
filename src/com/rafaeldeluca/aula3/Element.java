package aula3;

public class Element<TYPE> {	
	
	private TYPE value;
	private Element<TYPE> next; // ponteiro para o proximo Elemento
	
	public Element(TYPE value) {
		this.value = value;
	}

	public TYPE getValue() {
		return value;
	}

	public void setValue(TYPE value) {
		this.value = value;
	}

	public Element<TYPE> getNext() {
		return next;
	}

	public void setNext(Element<TYPE> next) {
		this.next = next;
	}
	
	

}
