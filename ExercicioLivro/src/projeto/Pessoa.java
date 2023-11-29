package projeto;

public class Pessoa {
	//Atributos
		private String name, sexo;
		private int idade;
		
		//Métodos
		public void fazerAniver() {
			this.idade++;
		}
			public Pessoa(String na, String se, int id) {
			super();
			this.name = na;
			this.sexo = se;
			this.idade = id;
		}


		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}
		
}
