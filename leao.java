package Polimosrfismo;

public class leao {
	public class Leao extends Animal {
		public Leao(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
		}
		@Override
		public void emitirSom() {
		System.out.println("o leao esta rugindo");
		}
		}

}
