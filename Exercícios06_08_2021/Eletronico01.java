package AtividadeGeneration04POO;

/*Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, em seguida crie
 *um objeto produto eletrônico, defina as instancias deste objeto e apresente as informações deste objeto no console.
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
	

