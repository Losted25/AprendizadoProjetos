package sistemaBancario;

public abstract class Cliente {
	protected String nome, cpf, tipo;
	protected float salario, divida, deposito, saque;
	protected boolean trabalhando;
	
	public abstract void sacar();
	public abstract void depositar();
	public abstract void solicitarEmprestimo();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getSaque() {
		return saque;
	}
	public void setSaque(float saque) {
		this.saque = saque;
	}
	public float getDivida() {
		return divida;
	}
	public void setDivida(float divida) {
		this.divida = divida;
	}
	
	public float getDeposito() {
		return deposito;
	}
	public void setDeposito(float deposito) {
		this.deposito = deposito;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public boolean isTrabalhando() {
		return trabalhando;
	}
	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
}
