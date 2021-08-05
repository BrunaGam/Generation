package AtividadeGeneration03;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double[] lançamento = new double [10];
		double soma = 0.0, maior = 0.0, media = 0.0;
		int x, maiorpont = 0;

		for(x = 0; x <=9; x++){
			System.out.println("Digite os lançamentos: ");
			lançamento[x] = ler.nextInt();
			
			soma = soma + lançamento[x];
			media = soma / 10;
			
			if(lançamento[x] == maior){
				maiorpont++;
				
			}if(maior < lançamento[x]){
				maior = lançamento[x];
			}
		}
		System.out.println("A soma dos lançamentos é: " + soma);
		System.out.println("\nA média dos lançamentos é: " + media);
		System.out.println("\nA quantidade do maior lançamento é: " + (maiorpont++) + " e o maior lançamento foi: " + maior);
		
	}

}
