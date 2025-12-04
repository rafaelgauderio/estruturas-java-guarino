package aula3;

public class LinkedList<TYPE> {

	private Element<TYPE> first;
	private Element<TYPE> last;
	private int listSize;

	public LinkedList() {
		this.listSize = 0;
	}

	public Element<TYPE> getFirst() {
		return first;
	}

	public void setFirst(Element<TYPE> first) {
		this.first = first;
	}

	public Element<TYPE> getLast() {
		return last;
	}

	public void setLast(Element<TYPE> last) {
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

	public void addElement(TYPE value) {
		Element<TYPE> newElement = new Element<TYPE>(value);
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

	public void removeElement(TYPE value) {
		Element<TYPE> previous = null;
		Element<TYPE> current = this.first;
		for (int i = 0; i < this.getListSize(); i++) {
			if (current.getValue().equals(value)) {
				// caso a lista só tiver 1 elemento
				// if(current==this.first && current==this.last) {
				if (this.listSize == 1) {
					this.first = null;
					this.last = null;
					// caso for o primeiro
					// o primeiro vai virar o proximo do atual e o atual vai excluir
				} else if (current == this.first) {
					this.first = current.getNext();
					current.setNext(null);
				} // caso for o ultimo
					// o ultimo vai virar o anterior e o atual vai excluir
				else if (current == this.last) {
					this.last = previous;
					previous.setNext(null);
				} else {
					// caso de um valor do meio da lista Ligada
					// ponteiro do anterior vai para o proximo do atual
					previous.setNext(current.getNext());
					// atual fica sem valor
					current = null;
				}

				listSize = this.listSize - 1;
				break;
			}
			// se exclui o atual; o anterior vira o atual e o atual vira o proximo;
			previous = current;
			current = current.getNext();
		}

	}

	public Element<TYPE> get(int position) {
		Element<TYPE> current = this.first;
		// senão tiver um próximo elemento, significa que ainda não chegou no último
		for (int i = 0; i < position; i++) {
			if (current.getNext() != null) {
				current = current.getNext();
			}
		}

		return current;
	}

}
