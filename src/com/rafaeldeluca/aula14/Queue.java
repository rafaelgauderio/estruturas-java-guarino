package aula14;

import aula3.Element;
import aula3.LinkedListPersonal;

public class Queue {

	private LinkedListPersonal<String> list;
	private int queueSize;

	public Queue() {
		this.queueSize = 0; // começa zerada a fila
		this.list = new LinkedListPersonal<>();
	}	
	

	public int getQueueSize() {
		return queueSize;
	}

	public void addEnd(String newValue) {
		this.list.addElement(newValue);
		this.queueSize++;
	}

	public void removeInitial() {
		this.list.removeElement(this.getFirst());
		this.queueSize--;
	}
	
	public Element<String> get (int i) {
		return this.list.get(i);
	}

	public String getFirst() {
		return this.list.getFirst().getValue();
	}

}
