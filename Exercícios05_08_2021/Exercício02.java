package AtividadeGeneration03;

import java.util.Scanner;

public class Exerc�cio02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double[] lan�amento = new double [10];
		double soma = 0.0, maior = 0.0, media = 0.0;
		int x, maiorpont = 0;

		for(x = 0; x <=9; x++){
			System.out.println("Digite os lan�amentos: ");
			lan�amento[x] = ler.nextInt();
			
			soma = soma + lan�amento[x];
			media = soma / 10;
			
			if(lan�amento[x] == maior){
				maiorpont++;
				
			}if(maior < lan�amento[x]){
				maior = lan�amento[x];
			}
		}
		System.out.println("A soma dos lan�amentos �: " + soma);
		System.out.println("\nA m�dia dos lan�amentos �: " + media);
		System.out.println("\nA quantidade do maior lan�amento �: " + (maiorpont++) + " e o maior lan�amento foi: " + maior);
		
	}

}
