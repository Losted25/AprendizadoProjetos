package heranca;

public class Funcionario extends Pessoa {
	//Atributos
		private String setor;
		private boolean trabalhando;
		
		//Métodos
		public void mudarTrabalho(){
			
		}

		public Funcionario(String no, String se, int id, String setor, boolean trabalhando) {
			super(no, se, id);
			this.setor = setor;
			this.trabalhando = trabalhando;
		}


		public String getSetor() {
			return setor;
		}

		public void setSetor(String setor) {
			this.setor = setor;
		}

		public boolean isTrabalhando() {
			return trabalhando;
		}

		public void setTrabalhando(boolean trabalhando) {
			this.trabalhando = trabalhando;
		}
}
