package c.om.rafaeldeluca.aula02;

public class BuscaLinear {
	
	public static void main(String [] args) {
		
		BuscaLinear search = new BuscaLinear();
		
		String [] names = new String [10];
		
		names[0] = "Rafael";
		names[1] = "João";
		names[2] = "Angêla";
		names[3] = "Claudia";
		names[4] = "Luciana";
		names[5] = "Marta";
		names[6] = "Laura";
		names[7] = "Ana";
		names[8] = "Luiz";
		names[9] = "Juliana";
		
		System.out.println("\n");
		
		for(int i=0; i<names.length; i++) {
			
			System.out.println("Name: " + names[i]);
			
		}		
		
		
		search.linearSearch("Rafael",names);
		search.linearSearch("Juliana",names);
		search.linearSearch("Cristina",names);
		search.linearSearch("Rafael",names);
		search.linearSearch("Mauren",names);
		
		
		
		
		
	}
	
	public void linearSearch(String searchFor, String [] vector) {
		
				
		String search = searchFor;
		//linear search
		boolean find = false;
		for (int i=0; i<vector.length; i++) {
			String element = vector[i];
			if(element.equalsIgnoreCase(search)) {
				find=true;
				
			}
		}
		if(find==true) {
			System.out.println("Element find.");
		}
		else {
			System.out.println("Element NOT find");
		}
		
	}
	

}
