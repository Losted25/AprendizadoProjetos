package calculo;

public abstract class Pessoa {
	protected int idade, cpf;
	protected String nome, sexo;
	protected boolean trabalha;

	public void fazerAniversario(){
		this.idade++;
	}
	public abstract void procurarEmprego();
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public boolean isTrabalha() {
		return trabalha;
	}
	public void setTrabalha(boolean trabalha) {
		this.trabalha = trabalha;
	}
		
} 
	