package Polimosrfismo;

public class PrincipalFU {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario(7, "joaquim", "0888888888", 999, "abululu");
		System.out.println(funcionario.calcularSalario(8000, 1000));
		System.out.println(funcionario.getNome());
		
		Horista horista = new Horista(1, "dyddi", "rua presidiolandia", 123, "159989760");
		System.out.println(horista.calcularSalario(8000, 1000));
		System.out.println(horista.getNome());
		
		Jornada jornada = new Jornada(7, "william", "15990760", 456, "rua presidiolandia");
		System.out.println(jornada.calcularSalario(2000, 1000));
		System.out.println(jornada.getNome());
		
		Consultorpj consultorpj = new Consultorpj(8, "will", "15990760", 456, "rua presidiolandia");
		System.out.println(consultorpj.calcularSalario(9000, 1000));
		System.out.println(consultorpj.getNome());

	}

}
