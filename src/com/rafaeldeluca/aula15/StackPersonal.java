package aula15;

import aula3.Element;
import aula3.LinkedListPersonal;

public class StackPersonal {

	private LinkedListPersonal<String> list;
	private int size;

	public StackPersonal() {
		this.size = 0;
		this.list = new LinkedListPersonal<>();
	}

	public LinkedListPersonal<String> getList() {
		return list;
	}

	public int getSize() {
		return size;
	}

	public void addOnTop(String newValue) {
		this.list.addOnTop(newValue);
		size++;
	}

	public void removeFromTop() {
		this.list.removeElement(this.get());
		size--;
	}

	public String get() {
		return this.list.getFirst().getValue();
	}

	public Element<String> get(int i) {
		return this.list.get(i);
	}

}
