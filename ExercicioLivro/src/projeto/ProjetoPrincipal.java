package projeto;

public class ProjetoPrincipal {
	public static void main(String [] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Raffael", "M", 22);
		p[1] = new Pessoa("Letícia", "F", 17);
		
		l[0] = new Livro("Aprendendo Java", "José da Silva", 250, p[0]);
		l[1] = new Livro("HTML e CSS", "Francisco Ramos", 180, p[1]);
		l[2] = new Livro("Viver a vida", "Rute Borges", 360, p[1]);
		
		l[0].abrir();
		l[0].folhear(200);
		l[0].avancarPag();
		System.out.println(l[0].detalhes());
		System.out.println(l[2].detalhes());
		
	}
}
