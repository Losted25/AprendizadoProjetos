package sistemaBancario;

public class ContaBanco {
	public static void main(String []args) {
		PessoaFisica pessoaConta1 = new PessoaFisica();
		
		pessoaConta1.setSalario(9500f);
		pessoaConta1.setSaldo(-3600.0f);
		pessoaConta1.setDivida(4500.0f);
		pessoaConta1.setDeposito(7500f);
		pessoaConta1.depositar();
		pessoaConta1.setSaque(6000.0f);
		pessoaConta1.sacar();
		pessoaConta1.pagarContas(); 
		//pessoaConta1.solicitarEmprestimo();
		//pessoaConta1.setNome("Raffael");

		System.out.println(pessoaConta1);
	}
}
