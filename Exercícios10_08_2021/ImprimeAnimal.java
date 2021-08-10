package AtividadesGeneration06;

public class ImprimeAnimal {

	public static void main(String[] args) {
		
		TestaAnimal ta = new TestaAnimal();
		Cachorro cachorro1 = new Cachorro();
		Cavalo cavalo1 = new Cavalo();
		Preguiça preguiça1 = new Preguiça();
		
		
		
		ta.somAnimal(new Cachorro());
		ta.correr(new Cachorro());
		cachorro1.setNome("Thor");
		cachorro1.setIdade(12);

		
		ta.somAnimal(new Cavalo());
		ta.correr(new Cavalo());
		ta.nome(new Cavalo());
		cavalo1.setIdade(20);
		
		ta.somAnimal(new Preguiça());
		ta.subir(new Preguiça());
		preguiça1.setNome("Cid");
		preguiça1.setIdade(38);;

	}

}
