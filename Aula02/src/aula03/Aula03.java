package aula03;

public class Aula03 {
	public static void main(String [] args) {
		Garrafa g1 = new Garrafa();
		g1.marca = "Alladin";
		g1.tipo = "Café";
		g1.litros = 1.5f;
		
		g1.status();
		g1.abrir();
		g1.beber();
	
		Garrafa g2 = new Garrafa();
		g2.marca = "Speedo";
		g2.tipo = "Água";
		g2.litros = 2.5f;
		
		g2.status();
		g2.fechar();
		g2.beber();
	}
}
