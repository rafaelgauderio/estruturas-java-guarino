package aula4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProgramComparator {
	
	public static void main (String [] args) {
		
		System.out.println("\nComparação de desempenho entre vetor e Lista ligada"
				+ "\nVetor mais rápido para ler porque elementos tem index."
				+ "\nLista ligada mais rápida para inserir porque não tem index, não tem que reordenar a lista"
				+ "\n\ttoda vez que insere um novo elemento.");
		
		List<Integer> list = new LinkedList<Integer>(); 
		int limit = 99999;
		long initialTime = System.currentTimeMillis();
		long finalTime = 0;
		for(int i=0; i < limit; i++) {
			list.add(i);
		}
		finalTime = System.currentTimeMillis();
		System.out.println("\nTempo para adicionar " + limit + " elementos na LinkedList"
				+ ": " + (finalTime - initialTime));
		
		
		ArrayList<Integer> array = new ArrayList<Integer>(); 
		initialTime = System.currentTimeMillis();		
		for(int i=0; i < limit; i++) {
			array.add(i);
		}
		finalTime = System.currentTimeMillis();
		System.out.println("\nTempo para adicionar " + limit + " elementos no vetor"
				+ ": " + (finalTime - initialTime));
		
		System.out.println("\nLendo os valores");
		initialTime = System.currentTimeMillis();	
		for(int j=0; j < list.size(); j++) {
			list.get(j);
		}
		finalTime= System.currentTimeMillis();
		System.out.println("Tempo para ler " + limit + " elementos na lista"
				+ ": " + (finalTime - initialTime));
		
		// lendo valores no vetor
		initialTime = System.currentTimeMillis();	
		for(int j=0; j < array.size(); j++) {
			array.get(j);
		}
		finalTime= System.currentTimeMillis();
		System.out.println("Tempo para ler " + limit + " elementos no vetor"
				+ ": " + (finalTime - initialTime));
		
	}

}
