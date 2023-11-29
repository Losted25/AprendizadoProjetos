package projetofinal;

public class Pessoa {
	protected int idade;
	protected String nome, sexo;
	protected float experiencia;
	
	
	
	public Pessoa(int idade, String nome, String sexo, float experiencia) {
		super();
		this.idade = idade;
		this.nome = nome;
		this.sexo = sexo;
		this.experiencia = 0;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(float experiencia) {
		this.experiencia = experiencia;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	protected void ganharExp() {
		
	}
}
