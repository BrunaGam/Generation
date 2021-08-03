package AtividadesGeneration;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
	double x;
	
	System.out.println("Digite um número: ");
	x = ler.nextInt();
	
	if(x %2 ==0){
		x= Math.sqrt(x);
		System.out.println("\nNúmero par. Sua raiz quadrada é: " + x);
	}
	else {
		x= Math.pow(x,2);
		System.out.println("\nNúmero ímpar. Seu número ao quadrado é:" + x);
	}
	ler.close();
}
	
}