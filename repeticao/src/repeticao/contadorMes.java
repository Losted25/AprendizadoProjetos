package repeticao;

public class contadorMes {
	public static void main(String [] args) {
		String mes [] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun","Jul", "Ago", "Set", "Out", "Nov", "Dez"};		
		int tot [] = {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int c=0; c<= mes.length; c++) {
			System.out.println("A quantidade de dias do mês " + mes[c] + " é: " + tot[c]);;
		} 
	}	
}
