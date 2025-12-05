package aula3;

public class LinkedListIterator<TYPE> {

	private Element<TYPE> element;

	public LinkedListIterator(Element<TYPE> currentElement) {
		this.element = currentElement;
	}

	public boolean hasNext() {
		if (element.getNext() != null) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public Element<TYPE> getNext () {
		element = element.getNext();
		return element;
	}

}
