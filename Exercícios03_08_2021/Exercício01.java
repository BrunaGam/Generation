package AtividadesGeneration;

import java.util.Scanner;

public class Exerc�cio01 {

	public static void main (String args[]) {
		
		Scanner ler = new Scanner (System.in);
		int numero_1, numero_2, numero_3;
		int vMaior;
		
		System.out.println("Digite 3 n�meros:");
        numero_1 = ler.nextInt();
        numero_2 = ler.nextInt();
        numero_3 = ler.nextInt();
		
		vMaior = numero_1;
		if(numero_2 > vMaior) {
			vMaior = numero_2;}
		
		if(numero_3 > vMaior) {
			vMaior = numero_3;}
		
		System.out.printf("\nO maior n�mero informado �:" + vMaior);
		
		ler.close();
	}
		
	
		}
	
		

