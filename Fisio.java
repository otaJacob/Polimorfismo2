package Polimosrfismo;
 
public class Fisio extends ProfissionalSaude{


	private String crefito;

	public Fisio (String Nome, String especialidade, int valorConsulta, String crefito) {
		super(Nome,especialidade,valorConsulta);
		this.crefito =  crefito;
	}

	public String getCrefito() {
		return crefito;
	}

	public void setCrefito(String crefito) {
		this.crefito = crefito;
	}

	@Override
	public void agendarConsulta () {
		return ;
		
	}

}
