package AtividadesGeneration05;

public class ImprimeAnimal {

	public static void main(String[] args) {
		
		TestaAnimal ta = new TestaAnimal();
		Cachorro cachorro1 = new Cachorro();
		Cavalo cavalo1 = new Cavalo();
		Pregui�a pregui�a1 = new Pregui�a();
		
		
		
		ta.somAnimal(new Cachorro());
		ta.correr(new Cachorro());
		cachorro1.setNome("Thor");
		cachorro1.setIdade(12);

		
		ta.somAnimal(new Cavalo());
		ta.correr(new Cavalo());
		ta.nome(new Cavalo());
		cavalo1.setIdade(20);
		
		ta.somAnimal(new Pregui�a());
		ta.subir(new Pregui�a());
		pregui�a1.setNome("Cid");
		pregui�a1.setIdade(38);;

	}

}
