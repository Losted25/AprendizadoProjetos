package ava1;

public class Computador {
	//Atributos
	public int qtdRam, ano;
	public float qtdArmazenamento;
	public String marca, processador;
	
	//Métodos 
	public Computador() {
		this.marca = "Ryzen";
		this.processador = "5600G";
		this.qtdArmazenamento = 0.5f;
		this.qtdRam = 16;
		this.ano = 2018;
	}
	
	public Computador(String marca, String processador, float qtdArmazenamento, int qtdRam, int ano) {
		this.marca = marca;
		this.processador = processador;
		this.qtdArmazenamento = qtdArmazenamento;
		this.qtdRam = qtdRam;
		this.ano = ano;
	}
	//Métodos de acesso
	public int getQtdRam() {
		return qtdRam;
	}



	public void setQtdRam(int qtdRam) {
		this.qtdRam = qtdRam;
	}



	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}



	public float getQtdArmazenamento() {
		return qtdArmazenamento;
	}



	public void setQtdArmazenamento(float qtdArmazenamento) {
		this.qtdArmazenamento = qtdArmazenamento;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getProcessador() {
		return processador;
	}



	public void setProcessador(String processador) {
		this.processador = processador;
	}
	
	public void Imprimir() {
		System.out.println("A marca do computador é: " + this.marca);
		System.out.println("O processador do computador é: " + this.processador);
		System.out.println("O ano do computador é: " + this.ano);
		System.out.println("A quantidade de armazenamento do computador é: " + this.qtdArmazenamento + " TB");
		System.out.println("A quantidade de memória RAM do computador é: " + this.qtdRam + " GB");
	}


}
