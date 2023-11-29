package sistemaBancario;

public abstract class Banco {
	protected String nome;
	protected int numId;
	protected float emprestimo;
	
	public abstract void abrirConta();
	public abstract void fecharConta();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumId() {
		return numId;
	}
	public void setNumId(int numId) {
		this.numId = numId;
	}

	
}
