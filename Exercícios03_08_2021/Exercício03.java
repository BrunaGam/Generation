package AtividadesGeneration;

import java.util.Scanner;
public class Exerc�cio03 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int x;
		
		System.out.println("Digite sua idade: ");
		x = ler.nextInt();
		
		if(x < 10 || x > 25){
			System.out.println("Voc� n�o possui categoria. \n");
		}
		else if(x >= 10 && x <=14){
			System.out.println("Categoria Infantil. \n");
		}
		else if(x >= 15 && x <=17){
			System.out.println("Categoria Juvenil. \n");
		}
		else{
			System.out.println("Categoria Adulto. \n");
		}
		ler.close();
	}
	

}
