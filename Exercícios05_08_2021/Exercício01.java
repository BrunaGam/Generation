package AtividadeGeneration03;

import java.util.Scanner;

public class Exerc�cio01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double[] pontuacao = new double[5];
		double maiorpont = 0.0;

		
		for(int i = 0; i< pontuacao.length; i++){
			System.out.println("Insira 5 n�meros: ");
			pontuacao[i] = new Scanner (System.in).nextFloat();
			
			if(pontuacao [i] > maiorpont){
				maiorpont = pontuacao[i];
			}
			System.out.println("\nA maior pontua��o �: " + maiorpont);
			System.out.println("");
		}
		
		ler.close();

	}

	
		
	}


