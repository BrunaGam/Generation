package AtividadeGeneration04POO;

/*Crie uma classe patinete e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto patinete,
 *defina as instancias deste objeto e apresente as informações deste objeto no console.
 */


public class Patinete01 {

	private String modeloPatinete;
	private String tamanhoPatinete;
	private String corPatinete;
	private String precoPatinete;
	
	public Patinete01 (String modelo, String tamanho, String cor, String preco)
	{
		modeloPatinete = modelo;
		tamanhoPatinete = tamanho;
		corPatinete = cor;
		precoPatinete = preco;

}
	public String getinformacoespatinete() {
		String informacoespatinete = modeloPatinete + " "+ tamanhoPatinete + " " + corPatinete + " " + precoPatinete;
		return informacoespatinete;
		
		
	}

}
	

