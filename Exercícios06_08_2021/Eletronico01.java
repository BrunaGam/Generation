package AtividadeGeneration04POO;

/*Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe, em seguida crie
 *um objeto produto eletr�nico, defina as instancias deste objeto e apresente as informa��es deste objeto no console.
 */


public class Eletronico01 {

	private String modeloEletronico;
	private String fabricanteEletronico;
	private String precoEletronico;
	private String idEletronico;
	
	public Eletronico01 (String modelo, String fabricante, String preco, String id)
	{
		modeloEletronico = modelo;
		fabricanteEletronico = fabricante;
		precoEletronico = preco;
		idEletronico = id;

}
	public String getinformacoesEletronico() {
		String informacoesEletronico = modeloEletronico + " "+ fabricanteEletronico + " " + precoEletronico + " " + idEletronico;
		return informacoesEletronico;
		
		
	}

}
	

