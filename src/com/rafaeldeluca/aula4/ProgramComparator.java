package aula4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import aula3.LinkedListIterator;
import aula3.LinkedListPersonal;

public class ProgramComparator {
	
	public static void main (String [] args) {
		
		System.out.println("\nComparação de desempenho entre vetor e Lista ligada"
				+ "\nVetor mais rápido para ler porque elementos tem index."
				+ "\nLista ligada mais rápida para inserir porque não tem index, "
				+ "\n\tnão tem que reordenar a lista toda vez que insere um novo elemento.");
		
		List<Integer> list = new LinkedList<Integer>();
		LinkedListPersonal<Integer> linkedListPersonal = new LinkedListPersonal<Integer>();
		ArrayList<Integer> array = new ArrayList<Integer>(); 
		
		// LinkedList
		int limit = 99999;
		long initialTime = System.currentTimeMillis();
		long finalTime = 0;
		for(int i=0; i < limit; i++) {
			list.add(i);
		}
		finalTime = System.currentTimeMillis();
		System.out.println("\nTempo para adicionar " + limit + " elementos na LinkedList da API do java"
				+ ": " + (finalTime - initialTime));
		
		// vetor
		initialTime = System.currentTimeMillis();		
		for(int i=0; i < limit; i++) {
			array.add(i);
		}
		finalTime = System.currentTimeMillis();
		System.out.println("Tempo para adicionar " + limit + " elementos no vetor"
				+ ": " + (finalTime - initialTime));
		
		// lista ligada personalizada
		initialTime = System.currentTimeMillis();
		for(int i=0; i < limit ; i++) {
			linkedListPersonal.addElement(i);
		}
		finalTime = System.currentTimeMillis();		
		System.out.println("Tempo para adicionar " + limit + " elementos na LinkedList Personalizada"
				+ ": " + (finalTime - initialTime));
		
		// tempo para ler os valores
		
		System.out.println("\nLendo os valores");
		initialTime = System.currentTimeMillis();	
		for(int j=0; j < list.size(); j++) {
			list.get(j);
		}
		finalTime= System.currentTimeMillis();
		System.out.println("Tempo para ler " + limit + " elementos na LinkedList da API do java"
				+ ": " + (finalTime - initialTime));
		
		// lendo valores no vetor
		initialTime = System.currentTimeMillis();	
		for(int j=0; j < array.size(); j++) {
			array.get(j);
		}
		finalTime= System.currentTimeMillis();
		System.out.println("Tempo para ler " + limit + " elementos no vetor"
				+ ": " + (finalTime - initialTime));
		
		// lendo valores na lista ligada personalizada
		initialTime = System.currentTimeMillis();	
		for(int j=0; j < linkedListPersonal.getListSize(); j++) {
			linkedListPersonal.get(j);
		}
		finalTime= System.currentTimeMillis();
		System.out.println("Tempo para ler " + limit + " elementos na LinkedList Personalizada"
				+ ": " + (finalTime - initialTime));
		
		// usando iterator
		initialTime = System.currentTimeMillis();
		LinkedListIterator <Integer> iterator = linkedListPersonal.get();
		while(iterator.hasNext()==true) {
			iterator.getNext();
		}
		finalTime = System.currentTimeMillis();
		System.out.println("Tempo para ler " + limit + " elementos na LinkedList Personalizada usando iterator"
				+ ": " + (finalTime - initialTime));			
		
		System.out.println("Usando o iterator não precisa percorrer a lista inteira a cada iteração."
				+ "Isso melhora muito a performance.");
	}

}
