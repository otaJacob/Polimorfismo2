package Polimosrfismo;

public class gato {
	public class Gato extends Animal {
		public Gato(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
		}
		@Override
		public void emitirSom() {
		System.out.println("o gato esta miando");
		}
		}

}
