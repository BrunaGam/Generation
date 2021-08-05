package AtividadeGeneration03;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int [][] M1 = new int [3][3];
		int soma = 0, somadiagonal = 0, l, c;
		
		System.out.println("Digite os valores das matrizes: ");
		
		for(l = 0; l < M1.length; l++){
			for(c = 0; c < M1.length; c++){
				M1[l][c] = entrada.nextInt();
				soma += M1[l][c];
				
				if(l == c){
					somadiagonal += M1[l][c];
					
				}
			
			}
						
		}
		System.out.println("A soma total dos valores é: " + soma);
		System.out.println("\nA soma da diagonal principal é: " + somadiagonal);
	}

}
