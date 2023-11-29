package aula02;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	void status(){
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Está tampada? " + this.tampada);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Qual o número da ponta da caneta? " + this.ponta);
		System.out.println("Carga: " + this.carga );
	}
	
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro! Não posso rabiscar");
		}else {
			System.out.println("Estou rabiscando");

		}
			
	}
	void tampar() {
		this.tampada = true;
	}
	void destampar() {
		this.tampada = false;
	}
}
