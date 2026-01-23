package aula17;

import java.util.ArrayList;

public class Graph<GENERIC> {

	private ArrayList<Node<GENERIC>> nodes;
	private ArrayList<Edge<GENERIC>> edges;

	public Graph() {
		this.nodes = new ArrayList<Node<GENERIC>>();
		this.edges = new ArrayList<Edge<GENERIC>>();
	}

	public void addNode(GENERIC data) {
		Node<GENERIC> newEdge = new Node<GENERIC>(data);
		this.nodes.add(newEdge);
	}

	public Node<GENERIC> getNode(GENERIC data) {
		Node<GENERIC> node = null;
		for (int i = 0; i < this.nodes.size(); i++) {
			if (this.nodes.get(i).getData().equals(data)) {
				node = this.nodes.get(i);
				break;
			}
		}
		return node;
	}

	public void addEdge(int weight, GENERIC startData, GENERIC endData) {
		Node<GENERIC> start = this.getNode(startData);
		Node<GENERIC> end = this.getNode(endData);
		Edge<GENERIC> edge = new Edge<GENERIC>(weight, start, end);
		start.addOutputEdge(edge);
		end.addInputEdge(edge);
		this.edges.add(edge);
	}

}
