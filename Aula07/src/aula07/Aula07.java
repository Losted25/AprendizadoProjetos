package aula07;

public class Aula07 {
	public static void main(String [] args) {
		Lutador l[] = new Lutador [6]; 
		  l[0] = new Lutador("Pretty Boy", "França", 31, 2,
				  11, 1, 68.9f, 1.75f);
		  
		  l[1] = new Lutador("Putscript", "Brasil", 29, 2,				  
				  14, 3, 57.8f, 1.68f);
		  
		  l[2] = new Lutador("Snapshadow", "EUA", 35, 1,
				  12, 2, 80.9f, 1.65f);
		  
		  l[3] = new Lutador("UFCobol", "Dinamarca", 28, 3,
				  5, 4, 119.3f, 1.70f);
		  
		  l[4] = new Lutador("Shadow of Dead", "México", 29, 0,
				  15, 1, 81.9f, 1.77f);
		  
		  l[5] = new Lutador("NerdArt", "EUA", 30, 2,
				  12, 4, 105.9f, 1.81f);
		  
		  
		l[0].status();
		l[4].apresentar();
	
		}
}
