package aula14;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAPIProgram {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<String>();

		queue.add("Phone");
		queue.add("Tablet");
		queue.add("Windows License");
		queue.add("Linux Server");
		queue.offer("Firewall Software");

		System.out.println("Current: " + queue);

		System.out.println("First Element: " + queue.peek());

		System.out.println("Remove first Element: " + queue.poll());
		System.out.println("Remove first Element again: " + queue.poll());

		// add at the end
		queue.add("PC Desktop");

		System.out.println("Current after remove and addition: " + queue);
		
		System.out.println("\n");
		do {
			System.out.println("Element: " + queue.poll());
		} while (queue.isEmpty() == false);
		
		System.out.println("Queue is empty? " + queue.isEmpty());
	}

}
