package AtividadesGeneration02;

import java.util.Scanner;

public class Exerc�cio06 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int numero, soma = 0, cont = 0, media = 0;
		
		do{
			System.out.println("Digite um n�mero: ");
			numero = ler.nextInt();
			
			if(numero %3 ==0 && numero !=0){
				soma = soma + numero;
				cont++;
				
			}
			
		}while(numero > 0);
		media = soma / cont;
		
		System.out.println("A m�dia dos n�meros �: " + media);
		}
	
	}
	


