package AtividadeGeneration04POO;

/*Crie uma classe paciente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto paciente,
 *defina as instancias deste objeto e apresente as informações deste objeto no console.
 */


public class Paciente01 {

	private String nomePaciente;
	private String idadePaciente;
	private String planoPaciente;
	private String telefonePaciente;
	
	public Paciente01 (String nome, String idade, String plano, String telefone)
	{
		nomePaciente = nome;
		idadePaciente = idade;
		planoPaciente = plano;
		telefonePaciente = telefone;

}
	public String getinformacoespaciente() {
		String informacoespaciente = nomePaciente + " "+ idadePaciente + " " + planoPaciente + " " + telefonePaciente;
		return informacoespaciente;
		
		
	}

}
	

