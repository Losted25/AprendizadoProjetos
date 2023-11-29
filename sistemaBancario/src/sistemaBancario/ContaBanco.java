package sistemaBancario;

public class ContaBanco {
	public static void main(String []args) {
		PessoaFisica[] contas = new PessoaFisica[3];
		
		contas[0] = new PessoaFisica();
		contas[0].setNome("Raffael");
		contas[0].setSalario(9500f);
		contas[0].setSaldo(-3600.0f);
		contas[0].setDivida(4500.0f);
				
		contas[1] = new PessoaFisica();
		contas[1].setNome("Maria");
		contas[1].setSalario(3400f);
		contas[1].setDeposito(7500f);
		contas[1].setSaque(6000.0f);
		
		contas[2] = new PessoaFisica();
		contas[2].setNome("José");
		contas[2].setSalario(2800f);

		
		System.out.println(contas[0]);
		System.out.println("---------------------------------------");
		
		System.out.println(contas[1]);
		contas[1].depositar();
		System.out.println("---------------------------------------");
		
		System.out.println(contas[2]);
		contas[2].sacar();
		contas[2].pagarContas(); 
		contas[2].solicitarEmprestimo();

	}
}
