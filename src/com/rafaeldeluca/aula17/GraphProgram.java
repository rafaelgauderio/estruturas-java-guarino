package aula17;

public class GraphProgram {

	public static void main(String[] args) {

		System.out.println("Utilizado para representar estruturas de dados comlexas.\n"
				+ "Estrutudas nãp-sequenciais que modelam relação entre elmentos.\n"
				+ "Esses elementos são formados por vértices e arestas, formando assim um rede.\n"
				+ "Como exemplo temos as redes sociais e maptas de rotas.\n"
				+ "Podem ser implementados utilizando matriz de adjacência ou lista de adjacência.\n");

		Graph<String> directedGraph = new Graph<String>();

		directedGraph.addNode("Rafael");
		directedGraph.addNode("De Luca");
		directedGraph.addNode("Claudia");
		directedGraph.addNode("Zara");
		directedGraph.addNode("Laurinha");

		directedGraph.addEdge(2, "Rafael", "De Luca");
		directedGraph.addEdge(3, "De Luca", "Zara");
		directedGraph.addEdge(1, "Zara", "Claudia");
		directedGraph.addEdge(1, "Rafael", "Claudia");
		directedGraph.addEdge(3, "Laurinha", "Rafael");
		directedGraph.addEdge(2, "Laurinha", "De Luca");
		
		
		System.out.println("Printing Nodes");
		directedGraph.printGraphUsingDepthFirstSearch();
	}

}
