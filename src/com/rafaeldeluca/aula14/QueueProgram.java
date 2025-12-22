package aula14;

public class QueueProgram {

	public static void main(String[] args) {

		System.out.println("Fila é um tipo abstrato de dados.\n" + "Não é uma estrutura de dados propriamente dita.\n"
				+ "FIFO = First In, First out.\n");

		Queue personalQueue = new Queue();
		personalQueue.addEnd("Rafael de Luca");
		personalQueue.addEnd("Julia da Silva");
		personalQueue.addEnd("Cláudia da Silva");
		personalQueue.addEnd("Larissa");
		personalQueue.addEnd("Zara de Luca");

		System.out.println("\nPrint Personal Queue");
		for (int i = 0; i < personalQueue.getQueueSize(); i++) {
			System.out.println(personalQueue.get(i).getValue());
		}

		// remove from the top
		personalQueue.removeInitial();
		// add on the end
		personalQueue.addEnd("Last Person");

		System.out.println("\nPrint Personal Queue");
		for (int i = 0; i < personalQueue.getQueueSize(); i++) {
			System.out.println(personalQueue.get(i).getValue());
		}		
		
	}

}
