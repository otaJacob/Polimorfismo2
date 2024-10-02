package Polimosrfismo;

	public class Horista extends Funcionario {
		private int valorHora;
		private int horasTrab;
		public Horista(int id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
		}
		@Override
		public double calcularSalario(double salarioBruto, double desconto) {
		return valorHora * horasTrab;
		}

}
