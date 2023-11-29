package projeto;

public class ContaTeste {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.cliente = "Raffael";
		conta.saldo = 3_000.00;
		conta.exibesaldo();
		
		//conta.saque(2000);
		//conta.exibesaldo();
		
		//conta.deposita(7000);
		//conta.exibesaldo();
		Conta destino = new Conta();
		destino.cliente = "Pai";
		destino.saldo = 40000;
		destino.exibesaldo();
	}
}
