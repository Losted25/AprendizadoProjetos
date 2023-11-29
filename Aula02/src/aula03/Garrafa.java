package aula03;

public class Garrafa {
	String marca;
	String tipo;
	float litros;
	boolean aberta;
	boolean fechada;
	
	void status() {
		System.out.println("Uma garrafa da marca " + this.marca);
		System.out.println("O que tem na garrafa? " + this.tipo);
		System.out.println("Quantos litros tem? " + this.litros + " L");
	}
	
	void beber() {
		if(this.aberta == true){
			System.out.println("Pode beber");
		}else {
			System.out.println("Desse jeito não conseguirá beber. Abra a garrafa");
		}

	}
	void abrir() {
		this.aberta = true;
	}
	void fechar() {
		this.aberta = false;
	}
}
