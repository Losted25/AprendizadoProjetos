package aula05;

public class Aula05 {
	public static void main(String [] args) {
		ContaBanco cb1 = new ContaBanco(0301,"Poupança","Creuza", 3500.50f, true);
		cb1.status();
		
		ContaBanco cb2 = new ContaBanco(0401,"Conta-Corrente","Jaime", 5000.25f, false);
		cb2.status();
	
		ContaBanco cb3 = new ContaBanco(0501,"Conta-Corrente","Carlos", 0.0f, true);
		cb3.status();
	}
}
