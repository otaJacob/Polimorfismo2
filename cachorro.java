package Polimosrfismo;

public class cachorro {
	public class Cachorro extends Animal{
		public Cachorro(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
		}
		@Override
		public void emitirSom() {
		System.out.println("o cachorro esta latindo");
		}
		}

}
