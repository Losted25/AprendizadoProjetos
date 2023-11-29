package aula07;

public class Lutador {
	//Atributos
		private String nome, nacionalidade, categoria;
		 private int idade, derrotas, vitorias, empates;
	    private float peso, altura;
		
		//Métodos 
		public void apresentar() {
			System.out.println("It's time!! Apresentando o lutador " + this.getNome());
			System.out.println("Diretamente da(o) " + this.getNacionalidade());
			System.out.println("Com " + this.getIdade() + " anos de idade");
			System.out.println("Pesando " + this.getPeso() + " KG" + " e com " + this.getAltura() + " m de altura");
			System.out.print("Com " + this.getVitorias() + " vitória(s), ");
			System.out.print(this.getEmpates() + " empate(s) e ");
			System.out.println(this.getDerrotas() + " derrota(s)");
		}
		public void status(){
			System.out.println(this.getNome() + " é um peso " + this.getCategoria());
			System.out.println("Ganhou " + this.getVitorias() + " vez(es)");
			System.out.println("Perdeu " + this.getDerrotas() + " vez(es)");
			System.out.println("Empatou " + this.getEmpates() + " vez(es)");
		}
		public void ganharLuta() {
			setVitorias(this.getVitorias()+1);
		}
		public void perderLuta() {
			setDerrotas(this.getDerrotas()+1);		
		}
		public void empatarLuta() {
			setEmpates(this.getEmpates()+1);
		}
		public Lutador(String no, String na, int id, int de, int vi, int em, float pe,
				float al) {
			super();
			this.nome = no;
			this.nacionalidade = na;
			this.idade = id;
			this.derrotas = de;
			this.vitorias = vi;
			this.empates = em;
			this.setPeso(pe);
			this.altura = al;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNacionalidade() {
			return nacionalidade;
		}
		public void setNacionalidade(String nacionalidade) {
			this.nacionalidade = nacionalidade;
		}
		public String getCategoria() {
			return categoria;
		}
		private void setCategoria() {
			if(this.peso<52.2) {
				this.categoria = "Inválido"; 
			}
			else if(this.peso<=70.3) {
				this.categoria = "Leve";
			}
			else if(this.peso<=83.9) {
				this.categoria = "Médio";
			}
			else if(this.peso<=120.2) {
				this.categoria = "Pesado";
			}else {
				this.categoria = "Inválido";
			}
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public int getDerrotas() {
			return derrotas;
		}
		public void setDerrotas(int derrotas) {
			this.derrotas = derrotas;
		}
		public int getVitorias() {
			return vitorias;
		}
		public void setVitorias(int vitorias) {
			this.vitorias = vitorias;
		}
		public int getEmpates() {
			return empates;
		}
		public void setEmpates(int empates) {
			this.empates = empates;
		}
		public float getPeso() {
			return peso;
		}
		public void setPeso(float peso) {
			this.peso = peso;
			this.setCategoria();
		}
		public float getAltura() {
			return altura;
		}
		public void setAltura(float altura) {
			this.altura = altura;
		}
}
