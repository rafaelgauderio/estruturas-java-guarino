package aula17;

import java.util.ArrayList;

public class Node<GENERIC> {
	
	// um Nó tem um lista de arestar que entram nele, um lista de arestas que saem dele e um valor

	private GENERIC data;
	@SuppressWarnings("unused")
	private ArrayList<Edge<GENERIC>> inputEdges;
	@SuppressWarnings("unused")
	private ArrayList<Edge<GENERIC>> outputEdges;

	public Node(GENERIC data) {
		this.data = data;
		this.inputEdges = new ArrayList<Edge<GENERIC>>();
		this.outputEdges = new ArrayList<Edge<GENERIC>>();
	}

	public GENERIC getData() {
		return data;
	}

	public void setData(GENERIC data) {
		this.data = data;
	}

	public ArrayList<Edge<GENERIC>> getInputEdges() {
		return inputEdges;
	}

	public ArrayList<Edge<GENERIC>> getOutputEdges() {
		return outputEdges;
	}

	public void addInputEdge(Edge<GENERIC> edge) {
		this.inputEdges.add(edge);
	}

	public void addOutputEdge(Edge<GENERIC> edge) {
		this.outputEdges.add(edge);
	}

}
