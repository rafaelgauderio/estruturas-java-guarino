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

	// não dá para setar o tamanho da list
	// aumenta apenas adicionando ou removendo elemento da lista
	/*
	 * public void setListSize(int listSize) { this.listSize = listSize; }
	 */

	public void addElement(String value) {
		Element newElement = new Element(value);
		// verificando se a lista está vazia
		// nesse caso o primeiro será também o último elemento
		if (this.first == null && this.last == null) {
			this.first = newElement;
			this.last = newElement;
			this.listSize++;
		} else {
			// adiciona um próximo elemento ao último e ele mesmo será o úitmo
			this.last.setNext(newElement);
			this.last = newElement;
			this.listSize++;
		}
	}

	public void removeElement(String value) {
		Element previous = null;
		Element current = this.first;
		for (int i = 0; i < this.getListSize(); i++) {
			if (current.getValue().equalsIgnoreCase(value)) {
				// caso de um valor do meio da lista Ligada
				// ponteiro do anterior vai para o proximo do atual
				previous.setNext(current.getNext());
				// atual fica sem valor
				current = null;
				listSize = this.listSize - 1;
				break;
			}
			// se exclui o atual; o anterior vira o atual e o atual vira o proximo;
			previous = current;
			current = current.getNext();
		}
		
	}

	public Element get(int position) {
		Element current = this.first;
		// senão tiver um próximo elemento, significa que ainda não chegou no último
		for (int i = 0; i < position; i++) {
			if (current.getNext() != null) {
				current = current.getNext();
			}
		}

		return current;
	}

}
