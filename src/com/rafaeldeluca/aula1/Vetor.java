package aula1;

import java.util.Arrays;

public class Vetor {

	public static void main(String [] args) {
		
		int [] vector = new int [10];
		
		vector[0]=13;
		vector[1]=7;
		vector[3]=19;
		vector[2]=6;
		vector[4]=12;
		vector[5]=16;
		vector[6]=1;
		vector[7]=2;
		vector[8]=5;
		vector[9]=18;
		
		for(int i=0; i<vector.length; i++) {
			System.out.println("Position: "+ (i+1) + ", value: " +vector[i]);
		}
		
		//for each
		System.out.println("\nFor each");
		int i=1;
		for(int nickname : vector) {
			System.out.println("Position: " + i + ", Value: " + nickname);
			i++;
		}
		
		System.out.println("\nFor each as stream");
		Arrays.stream(vector).forEach(System.out::println);
		System.out.println("\nFor each as lambda expression");
		Arrays.stream(vector).forEach((value) -> System.out.printf("%d\t",value));
		
	}
	
}
