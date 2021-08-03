package AtividadesGeneration;

import java.util.Scanner;
public class Exercício02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite 3 números: ");
		n1 = ler.nextInt();
		n2 = ler.nextInt();
		n3 = ler.nextInt();
		
		if(n1 <= n2 && n2 <= n3){
			System.out.println("A ordem crescente é: \n" + n1 + n2 + n3);
		}
		else if(n1 <= n3 && n3 <= n2) {
			System.out.println("A ordem crescente é: \n" + n2 + n1 + n3);
		}
		else if (n2 <= n1 && n1 <= n3) {
			System.out.println("A ordem crescente é: \n" + n2 + n1 + n3);
		}
		else if(n2 <= n3 && n3 <= n1) {
			System.out.println("A ordem crescente é: \n" + n2 + n3 + n1);
		}
		else if(n3 <= n1 && n1 <= n2){
			System.out.println("A ordem crescente é: \n" + n3 + n1 + n2);
		}
		else {
			System.out.println("A ordem crescente é: \n" + n3 + n2 + n1);
		}
		
		ler.close();
	}

}
