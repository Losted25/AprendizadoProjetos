package calculo;

public class ProjetoPrincipal {
	public static void main(String [] args){
		Aluno a1 = new Aluno();
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Aposentado ap1 = new Aposentado();
		Estagiario e1 = new Estagiario();

		
		a1.setNome("Raffael"); a1.setA1(3.5f); a1.setA2(3.6f); 
		a1.setIdade(22); a1.setTrabalha(true); a1.procurarEmprego(); a1.fazerAniversario(); a1.calcularMedia();
		
		System.out.println("O nome do aluno é: " + a1.getNome()); 
		System.out.println("A média do aluno é: " + a1.getMedia());
		System.out.println("A idade do aluno é: " + a1.getIdade());
		
		System.out.println("--------------------------------------------------------------------- ");

		f1.setNome("Leonardo"); f1.setIdade(35); f1.setTrabalha(true); f1.setSalario(3600f);
		f1.fazerAniversario(); f1.setTempoTrabalho(25); f1.procurarEmprego();
		f1.calcularImpostoRenda();
		System.out.println("O nome do funcionário é: " + f1.getNome()); 
		System.out.println("O salário do funcionário é R$ " + f1.getSalario());
		
		
		System.out.println("--------------------------------------------------------------------- ");
		
		ap1.setNome("Roberto"); ap1.setIdade(65); ap1.setTrabalha(false); ap1.setSalario(16000f);
		ap1.fazerAniversario(); ap1.setTempoTrabalho(30); ap1.procurarEmprego();
		System.out.println("O nome do funcionário é: " + ap1.getNome()); 
		System.out.println("O salário do funcionário é R$ " + ap1.getSalario());
		ap1.calcularImpostoRenda();
		ap1.setGastos(20500.50f);ap1.gastar();
		
		System.out.println("--------------------------------------------------------------------- ");
		e1.setBolsistaIntegral(true);
		e1.setAuxRef(43*21); e1.setAuxTra(17*11); e1.setSalario(1546); e1.setMensalidade(350f);
		e1.pagarMensalidade(); e1.salarioBruto(); e1.calcularImpostoRenda();
		}
	
}
