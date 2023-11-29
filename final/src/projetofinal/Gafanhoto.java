package projetofinal;

public class Gafanhoto extends Pessoa{
	private String login;
	private int totAssistido;
	
	
	public Gafanhoto(int idade, String nome, String sexo, float experiencia, String login) {
		super(idade, nome, sexo, experiencia);
		this.login = login;
		this.totAssistido = 0;
		
		}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public int getTotAssistido() {
		return totAssistido;
	}


	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}


	@Override
	public String toString() {
		return "Gafanhoto [login=" + login + ", totAssistido=" + totAssistido + ", idade=" + idade + ", nome=" + nome
		+ ", sexo=" + sexo + ", experiencia=" + experiencia + "]";
	}	
	
}
