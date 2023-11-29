package sistemaBancario;

public class ContaBanco {
	public static void main(String []args) {
		PessoaFisica pessoaConta1 = new PessoaFisica();
		
		pessoaConta1.setSalario(-3600.5f);pessoaConta1.setDivida(4500.60f);pessoaConta1.setDeposito(7500f);
		pessoaConta1.depositar();// pessoaConta1.pagarContas(); 
		pessoaConta1.setSaque(2800f); pessoaConta1.sacar();
		pessoaConta1.solicitarEmprestimo();
		pessoaConta1.setNome("Raffael");
		pessoaConta1.toString();
	}
}
