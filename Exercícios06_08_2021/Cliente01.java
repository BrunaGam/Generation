package AtividadeGeneration04POO;

public class Cliente01 {
//Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente, defina as instancias deste objeto e 
	//apresente as informações deste objeto no console.
	
	private String nomeCompleto;
	private String adressCliente;
	private String telefonCliente;
	private String idCliente;
	
	public Cliente01 (String nome, String endereço, String telefone, String id)
	{
		nomeCompleto=nome;
		adressCliente=endereço;
		telefonCliente=telefone;
		idCliente=id;

}
	public String getinformacoesCliente() {
		String informacoesCliente = nomeCompleto + " "+ adressCliente + " "+ telefonCliente + " " + idCliente;
		return informacoesCliente;
		
		
	}

}
	

