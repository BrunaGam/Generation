package AtividadeGeneration04POO;

/*Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto avi�o.
 * Defina as instancias deste objeto e apresente as informa��es deste objeto no console.
 */


public class Avi�o01 {

	private String modeloAvi�o;
	private String capacidadeAvi�o;
	private String velocidadeAvi�o;
	private String pesoAvi�o;
	
	public Avi�o01 (String modelo, String capacidade, String velocidade, String peso)
	{
		modeloAvi�o = modelo;
		capacidadeAvi�o = capacidade;
		velocidadeAvi�o = velocidade;
		pesoAvi�o = peso;

}
	public String getinformacoesAvi�o() {
		String informacoesAvi�o = modeloAvi�o + " "+ capacidadeAvi�o + " " + velocidadeAvi�o + " " + pesoAvi�o;
		return informacoesAvi�o;
		
		
	}

}
	

