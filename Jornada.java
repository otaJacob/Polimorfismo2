package Polimosrfismo;
 
public class Jornada extends Funcionario {
private int disc2;
private int inss;
public Jornada(int id, String nome, String telefone, int matricula, String endereco) {
super(id, nome, telefone, matricula, endereco);
}
@Override
public double calcularSalario(double salarioBruto, double desconto) {
return (salarioBruto - disc2 - inss);
}
}

