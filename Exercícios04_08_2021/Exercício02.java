package AtividadesGeneration02;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int nPar = 0, nImpar = 0, num;

		for(int i = 1; i <= 10; i++) {
			System.out.println("\nDigite o " + i + "º número: ");
			num = in.nextInt();
			
			if(num %2 == 0) {
				nPar++;
				}
				
				else {
					nImpar++;
				}
			
				
		
				}
			System.out.println("Quantidade de nºs pares é: " + nPar);
			System.out.println("Quantidade de nºs ímpares é: " + nImpar);
			
			}
		
	}
	
