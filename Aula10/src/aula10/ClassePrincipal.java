package aula10;

public class ClassePrincipal {
	public static void main(String []args) {
		//Animal a1 = new Animal();
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Ave a = new Ave();
		Peixe p = new Peixe();
		
		Cachorro ca = new Cachorro();
		Canguru c = new Canguru();
		Cobra cb = new Cobra();
		Arara ar = new Arara();
		Tartaruga t = new Tartaruga();
		GoldFish gd = new GoldFish();
		Lobo l = new Lobo();
		
		//m.setCorPelo("Marrom");
		//m.setPeso(25.5f);
		//m.alimentar();
		//m.emitirSom();
		//m.locomover();
		//a.locomover();
		//ar.alimentar();
		//gd.soltarBolha();
		//ca.locomover();
		//c.locomover();
		//l.emitirSom();
		ca.reagir(11,45);
		ca.reagir(19,00);
		ca.reagir(true);
		ca.reagir(2,12.5f);



		ca.emitirSom();
		//System.out.println("A cor do pelo é " + m.getCorPelo());
		//System.out.println("O peso dele é " + m.getPeso() + " KG");
	}
}
