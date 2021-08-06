package AtividadeGeneration04POO;

/*Crie uma classe conta bancaria e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto conta bancaria,
 *defina as instancias deste objeto e apresente as informações deste objeto no console.
 */


public class ContaBancaria01 {

	private String numeroDaAgencia;
	private String numeroDaConta;
	private String nomeDoCliente;
	private String tipoDaConta;
	
	public ContaBancaria01 (String agencia, String conta, String nome, String tipo)
	{
		numeroDaAgencia = agencia;
		numeroDaConta = conta;
		nomeDoCliente = nome;
		tipoDaConta = tipo;

}
	public String getinformacoesconta() {
		String informacoesconta = numeroDaAgencia + " "+ numeroDaConta + " " + nomeDoCliente + " " + tipoDaConta;
		return informacoesconta;
		
		
	}

}
	

