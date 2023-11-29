package sistemaBancario;

public class PessoaFisica  extends Cliente{
	public void pagarContas() {
		double valorFinal = getSalario()- getDivida();
		String valorFormatado = String.format("%.2f", valorFinal);
		
		if(salario>=0) {
			System.out.println("Sua dívida é de R$ " +getDivida());
			System.out.print("Sua dívida foi paga. Seu saldo atual é de R$ " + valorFormatado);
		}else {
			System.out.println("Sua dívida é de R$ " +getDivida());
			System.out.println("Não é possível pagar sua dívida por causa que seu saldo está negativo.\n"
					+ "Entre em contato com sua agência e regularize suas pendências.");
		}
	}
	public void transferirConta() {
		System.out.println("");
	}
	@Override
	public void sacar() {
		if(salario>0) {
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("O valor do saque é de R$ " +getSaque());
			System.out.print("Saque realizado. Seu saldo atual é de R$ " + (getSalario()-getSaque()));
		}else {
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("Não é possívle realziar o saque, pois seu saldo é de R$ " + getSalario());
				}
	}

	@Override
	public void depositar() {
		this.salario = getSalario()+getDeposito();
		System.out.println("O valor depositado é de R$ " + getDeposito() 
		+ "\nSeu saldo é de R$ " + this.salario);
	}

	@Override
	public void solicitarEmprestimo() {
		if(salario <= 0) {
			System.out.println("\n---------------------------------------------------------------------------");
			System.out.println("É possível parcelar sua divída em 4x , com juros de 9%");
		}else{
			System.out.println("\n---------------------------------------------------------------------------");
			System.out.println("Não há necessidade de empréstimo." 
		+ "\nMas caso deseje, entre em contato com seu gerente ou visite sua agência.");
		}
	}
}
