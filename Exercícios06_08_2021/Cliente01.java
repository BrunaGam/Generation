package AtividadeGeneration04POO;

public class Cliente01 {
//Crie uma classe cliente e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto cliente, defina as instancias deste objeto e 
	//apresente as informa��es deste objeto no console.
	
	private String nomeCompleto;
	private String adressCliente;
	private String telefonCliente;
	private String idCliente;
	
	public Cliente01 (String nome, String endere�o, String telefone, String id)
	{
		nomeCompleto=nome;
		adressCliente=endere�o;
		telefonCliente=telefone;
		idCliente=id;

}
	public String getinformacoesCliente() {
		String informacoesCliente = nomeCompleto + " "+ adressCliente + " "+ telefonCliente + " " + idCliente;
		return informacoesCliente;
		
		
	}

}
	

