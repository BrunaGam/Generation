package AtividadeGeneration04POO;

/*Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto funcionário,
 *defina as instancias deste objeto e apresente as informações deste objeto no console.
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
	

