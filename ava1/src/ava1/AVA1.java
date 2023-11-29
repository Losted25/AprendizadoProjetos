package ava1;

public class AVA1 {
	public static void main(String [] args) {
		Computador c1 = new Computador();
		c1.setAno(2023);
		c1.setMarca("Ryzen");
		c1.setProcessador("5600g");
		c1.setQtdArmazenamento(0.5f);
		c1.setQtdRam(24);		
		
		
		Computador c2 = new Computador();
		c2.setAno(2010);
		c2.setMarca("Intel");
		c2.setProcessador("Dual Core");
		c2.setQtdArmazenamento(1.0f);
		c2.setQtdRam(4);		
		
		
		Computador c3 = new Computador();
		c3.setAno(2018);
		c3.setMarca("Ryzen");
		c3.setProcessador("3200g");
		c3.setQtdArmazenamento(1.5f);
		c3.setQtdRam(16);		
				
		c1.Imprimir();
		c2.Imprimir();
		c3.Imprimir();
	}
}
