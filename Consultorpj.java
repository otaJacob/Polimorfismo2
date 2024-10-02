package Polimosrfismo;

	public class Consultorpj extends Funcionario {
		private int imposto;
		public Consultorpj(int id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
		}
		@Override
		public double calcularSalario(double salarioBruto, double desconto) {
		return (salarioBruto - imposto );
		}

}
