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

	public void printGraphUsingDepthFirstSearch() {
		ArrayList<Node<GENERIC>> arrayOfVisited = new ArrayList<Node<GENERIC>>();
		ArrayList<Node<GENERIC>> queueOfUnvisited = new ArrayList<Node<GENERIC>>();
		// começa no primeiro nó

		Node<GENERIC> currency = this.nodes.get(4);
		/*
		 * if (currency.getInputEdges().isEmpty()) { for (int i = 0; i < nodes.size();
		 * i++) { currency = this.nodes.get(i); break; } }
		 */
		arrayOfVisited.add(currency);
		System.out.println(currency.getData());
		// após imprimir marca como nó visitado
		queueOfUnvisited.add(currency);
		// vai imprimindo enquando a lista de não visitados tiver nós
		while (queueOfUnvisited.size() > 0) {
			Node<GENERIC> visitedNode = queueOfUnvisited.get(0);
			for (int i = 0; i < visitedNode.getOutputEdges().size(); i++) {
				Node<GENERIC> nextNode = visitedNode.getOutputEdges().get(i).getEnd();
				if (arrayOfVisited.contains(nextNode) == false) { // só o nó ainda não foi visitado
					arrayOfVisited.add(nextNode);
					System.out.println(nextNode.getData());
					queueOfUnvisited.add(nextNode);
				}
			}
			queueOfUnvisited.remove(0);

		}
	}

}
