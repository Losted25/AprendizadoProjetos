package sistemaBancario;

public class PessoaFisica extends Cliente{

	public void pagarContas() {
		double valorFinal = getSalario()- getDivida();
		String valorFormatado = String.format("%.2f", valorFinal);
		
		if(salario>=0&&divida>0) {
			System.out.println("Sua dívida é de R$ " +getDivida());
			System.out.print("Sua dívida foi paga. Seu saldo atual é de R$ " + valorFormatado);
		}else if(salario<0){
			System.out.println("Sua dívida é de R$ " +getDivida());
			System.out.println("Não é possível pagar sua dívida por causa que seu saldo está negativo.\n"
					+ "Entre em contato com sua agência e regularize suas pendências.");
		}else {
			System.out.println("\nVocê não possui dívidas.");
		}
	}
	public void transferirConta() {
		System.out.println("");
	}
	@Override
	public void sacar() {
		if(salario>0&&saque>0) {
			System.out.println("\nO valor do saque é de R$ " +getSaque());
			System.out.print("Saque realizado. Seu saldo atual é de R$ " + (getSalario()-getSaque()));
		}else if(salario>0&&saque<0){
			System.out.println("Não é possívle realizar o saque, pois seu saldo é de R$ " + getSalario());
		}else {
			System.out.println("Não é possívle realizar o saque, pois você não especificou o valor "
					+ "que deseja sacar.");
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
			System.out.println("É possível parcelar sua divída em 4x , com juros de 9%");
		}else{
			System.out.println("Não há necessidade de empréstimo." 
		+ "\nMas caso deseje, entre em contato com seu gerente ou visite sua agência.");
		}
	}
	@Override
	public String toString() {
		return "Dados \n1- nome = " + nome + "\n2 - cpf = " + cpf + "\n3- salario = R$ " + salario 
				+ "\n4- saldo atual = R$ " + saldo + "\n5- divida = R$ " + divida + "\n6- deposito = R$" 
				+ deposito + "\n7- saque = R$" + saque;
	}
	
}
