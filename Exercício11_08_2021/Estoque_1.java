package Collections;

import java.util.ArrayList;

public class Estoque_1 {

	public static void main(String[] args) {
		
		String estoque1 = "Versace";
		String estoque2 = "Prada";
		String estoque3 = "Gucci";
		String estoque4 = "Balanciaga";
		String estoque5 = "Lacoste";
		
		ArrayList<String> estoque = new ArrayList<>();
		estoque.add(estoque1);
		estoque.add(estoque2);
		estoque.add(estoque3);
		estoque.add(estoque4);
		estoque.add(estoque5);
		
		System.out.println(estoque);
		
		estoque.add(estoque5);
		System.out.println(estoque);
		
		estoque.remove(0);
		System.out.println(estoque);
		
		for(String i: estoque){
			System.out.println("Temos os perfumes: " + i);
		}
	}
}


