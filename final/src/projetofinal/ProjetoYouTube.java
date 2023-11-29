package projetofinal;

public class ProjetoYouTube {
	public static void main(String []args) {
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 1 de JAVA");
		v[2] = new Video("Aula 1 de HTML e CSS");
		
		Gafanhoto g[] = new Gafanhoto[3];
		g[0] = new Gafanhoto (22, "Raffael",  "M",0, "raffa" );
		g[1] = new Gafanhoto (29, "Carla",  "F",0, "carlinha");
		g[2] = new Gafanhoto (17, "Pablo","M",0, "pblo");

		Visualizacoes vis[] = new Visualizacoes[3];
		vis[0]= new Visualizacoes (g[0], v[0]);
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		vis[1]= new Visualizacoes (g[0], v[2]);
		System.out.println(vis[1].toString());
		vis[1].avaliar(87.0f);
		System.out.print(g[0]);
	}
}
