package aula17;

public class Edge<GENERIC> {
	
	// aresta tem um peso de um Nó na entrada e um Nó da saída
	// em um grafo direcional

	private int weight;
	private Node<GENERIC> start;
	private Node<GENERIC> end;

	public Edge(int weight, Node<GENERIC> start, Node<GENERIC> end) {
		this.weight = weight;
		this.start = start;
		this.end = end;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Node<GENERIC> getStart() {
		return start;
	}

	public void setStart(Node<GENERIC> start) {
		this.start = start;
	}

	public Node<GENERIC> getEnd() {
		return end;
	}

	public void setEnd(Node<GENERIC> end) {
		this.end = end;
	}
	
	

}
