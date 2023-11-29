package aula04;

public class Aula04 {
	public static void main (String [] args){
		Caneta c1 = new Caneta("NIC", "Amarela",1.0f);
		//c1.setModelo("Bic");
		//c1.modelo = "BIC";
		//c1.setPonta(0.5f);
		c1.status();
		
		Caneta c2 = new Caneta("Faber","Preta", 2.0f);
		c2.status();
		
		System.out.println("Tenho uma caneta " + c1.getModelo() 
		+ " de ponta " + c1.getPonta());
	}
}
