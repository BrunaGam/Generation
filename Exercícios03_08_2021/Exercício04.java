package AtividadesGeneration;

import java.util.Scanner;

public class Exerc�cio04 {

	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
	double x;
	
	System.out.println("Digite um n�mero: ");
	x = ler.nextInt();
	
	if(x %2 ==0){
		x= Math.sqrt(x);
		System.out.println("\nN�mero par. Sua raiz quadrada �: " + x);
	}
	else {
		x= Math.pow(x,2);
		System.out.println("\nN�mero �mpar. Seu n�mero ao quadrado �:" + x);
	}
	ler.close();
}
	
}