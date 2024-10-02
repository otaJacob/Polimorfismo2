package Polimosrfismo;

public class PrincipalSaude {

	public static void main(String[] args) {
		Medico medico = new Medico("Dr. João", "Cardiologia", 300, "123456");
        Dentista dentista = new Dentista("Dr. Pedro", "Ortodontia", 250, "654321");
        Fisio  fisio = new Fisio ("Dr. Maria", "Fisioterapia", 200, "987654");

        medico.agendarConsulta();
        dentista.agendarConsulta();
        fisio.agendarConsulta();
    }
}