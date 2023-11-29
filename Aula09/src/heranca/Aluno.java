package heranca;

public class Aluno extends Pessoa{
	//Atributos
		private int matricula;
		private String curso;
		
		//Métodos
		public void cancelarMat() {
			
		}
		
		public Aluno(String nome, String sexo, int idade) {
			super(nome, sexo, idade);
			// TODO Auto-generated constructor stub
		}

		public int getMatricula() {
			return matricula;
		}

		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}

		public String getCurso() {
			return curso;
		}

		public void setCurso(String curso) {
			this.curso = curso;
		}
		
}
