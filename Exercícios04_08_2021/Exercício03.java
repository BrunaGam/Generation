package AtividadesGeneration02;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
		
		int idade = 0, contpm21 = 0, contpm50 = 0;
		
		Scanner ler = new Scanner (System.in);
		
		while(idade > -99) {
			System.out.println("Entre com sua idade: ");
			idade = ler.nextInt();
			
			if(idade <= 21) {
				contpm21++;	
			}
			else if(idade >= 50){
				contpm50++;
				
			}
		}
		contpm21 = contpm21 -1;
		
		System.out.println("Total de pessoas com menos de 21 anos é: " + contpm21);
		System.out.println("Total de pessoas com mais de 50 anos é: " + contpm50);
	}

}
