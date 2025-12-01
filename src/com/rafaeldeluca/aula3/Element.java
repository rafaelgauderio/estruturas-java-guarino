package aula3;

public class Element {	
	
	private String value;
	private Element next; // ponteiro para o proximo Elemento
	
	public Element(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Element getNext() {
		return next;
	}

	public void setNext(Element next) {
		this.next = next;
	}
	
	

}
