package AtividadeGeneration04POO;

/*Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto funcion�rio,
 *defina as instancias deste objeto e apresente as informa��es deste objeto no console.
 */


public class Funcionario01 {

	private String nomeFuncionario;
	private String cargoFuncionario;
	private String salarioFuncionario;
	private String numeroRegistro;
	
	public Funcionario01 (String nome, String cargo, String salario, String numero)
	{
		nomeFuncionario = nome;
		cargoFuncionario = cargo;
		salarioFuncionario = salario;
		numeroRegistro = numero;

}
	public String getinformacoesfuncionario() {
		String informacoesfuncionarios = nomeFuncionario + " "+ cargoFuncionario + " " + salarioFuncionario + " " + numeroRegistro;
		return informacoesfuncionarios;
		
		
	}

}
	

