package heranca;

public class Professor extends Pessoa{
	
	//Atributos
	private String especialidade;
	private int salario;
	
	//Métodos
	public void receberAum() {
		
	}

	public Professor(String nome, String sexo, int idade, String especialidade, int salario) {
		super(nome, sexo, idade);
		this.especialidade = especialidade;
		this.salario = salario;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	

}
