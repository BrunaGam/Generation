package AtividadeGeneration04POO;

/*Crie uma classe avião e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto avião.
 * Defina as instancias deste objeto e apresente as informações deste objeto no console.
 */


public class Avião01 {

	private String modeloAvião;
	private String capacidadeAvião;
	private String velocidadeAvião;
	private String pesoAvião;
	
	public Avião01 (String modelo, String capacidade, String velocidade, String peso)
	{
		modeloAvião = modelo;
		capacidadeAvião = capacidade;
		velocidadeAvião = velocidade;
		pesoAvião = peso;

}
	public String getinformacoesAvião() {
		String informacoesAvião = modeloAvião + " "+ capacidadeAvião + " " + velocidadeAvião + " " + pesoAvião;
		return informacoesAvião;
		
		
	}

}
	

