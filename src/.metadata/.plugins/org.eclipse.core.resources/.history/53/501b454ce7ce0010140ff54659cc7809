package aula3;

public class LinkedList {

	private Element first;
	private Element last;
	private int listSize;

	public LinkedList() {
		this.listSize = 0;
	}

	public Element getFirst() {
		return first;
	}

	public void setFirst(Element first) {
		this.first = first;
	}

	public Element getLast() {
		return last;
	}

	public void setLast(Element last) {
		this.last = last;
	}

	public int getListSize() {
		return listSize;
	}
	
	public void addElement(String value) {
		Element newElement = new Element(value);
		// verificando se a lista está vazia
		// nesse caso o primeiro será também o último elemento
		if(this.first ==null && this.last==null) {
			this.first = newElement;
			this.last = newElement;
			this.listSize++;
		}
	}

	// não dá para setar o tamanho da list
	// aumenta apenas adicionando ou removendo elemento da lista
	/*
	 * public void setListSize(int listSize) { this.listSize = listSize; }
	 */

}
