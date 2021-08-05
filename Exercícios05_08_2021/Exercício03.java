package AtividadeGeneration03;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		

		
		int[][] matrizn1 = new int[2][3];
		
		int[][] matrizn2 = new int[2][3]; 
		
		int[][] matrizM1 = new int[2][3];
		
		int[][] matrizM2 = new int[2][3];
				
		
		for(int i=0;i < 2 ; i++){             // ENTRADA DE DADOS DAS MATRIZES N1 E N2 E CALCULO DA MATRIZ M1(SOMA) E M2(SUBTRACAO)
			for(int j=0;j<3;j++){
				System.out.printf("Digite o valor [%d][%d] da matriz N1", i, j);
				matrizn1[i][j] = entrada.nextInt();
				System.out.printf("Digite o valor [%d][%d] da matriz N2", i, j);
				matrizn2[i][j] = entrada.nextInt();
				
				
				matrizM1[i][j] = matrizn1[i][j] + matrizn2[i][j];
				matrizM2[i][j] = matrizn1[i][j] - matrizn2[i][j];
			}
			System.out.println();
		}
		
		// ------------------------------------------------------------------------------------------------------------------------------------
		for (int i = 0; i < 50; ++i) System.out.println ();  // Limpando a tela dos dados de entrada
		
		
		
		System.out.println("Imprimindo a matriz N1: \n");  // IMPRINMINDO A MATRIZ N1
		for(int i=0;i < 2 ; i++){ 
			for(int j=0;j<3;j++){				
				System.out.print(matrizn1[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		
		
		
		System.out.println("Imprimindo a matriz N2: \n");    // IMPRINMINDO A MATRIZ N2
		for(int i=0;i < 2 ; i++){ 
			for(int j=0;j<3;j++){				
				System.out.print(matrizn2[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		

		
		System.out.println("Imprimindo a matriz SOMA N1 + N2: \n");     //IMPRINMINDO A MATRIZ SOMA
		for(int i=0;i < 2 ; i++){
			for(int j=0;j<3;j++){				
				System.out.print(matrizM1[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		
		
		
		
		System.out.println("Imprimindo a matriz SUBTRACAO N1 - N2: \n");        //IMPRINMINDO A MATRIZ SUBTRACAO
		for(int i=0;i < 2 ; i++){
			for(int j=0;j<3;j++){				
				System.out.print(matrizM2[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		
	}



	}


