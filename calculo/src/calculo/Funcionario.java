package calculo;

public class Funcionario extends Pessoa implements CalculadorImpostoRenda{
	protected String cargo, funcao;
	protected int matricula, tempoTrabalho;
	protected float salario;

	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getFuncao() {
		return funcao;
	}


	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public int getTempoTrabalho() {
		return tempoTrabalho;
	}


	public void setTempoTrabalho(int tempoTrabalho) {
		this.tempoTrabalho = tempoTrabalho;
	}


	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}


	@Override
	public void procurarEmprego() {
		if(idade>=25&&trabalha==true&&tempoTrabalho<30) {
			System.out.println("Parabéns!! Está empregado e você contribuiu " + getTempoTrabalho() + " anos.");
		
		}else if(idade>=25&&trabalha==false&&tempoTrabalho<30) {
			System.out.println("Está na hora de procurar um emprego. "
					+ "Você já contribuiu " + getTempoTrabalho() + " anos."
							+ "\nAinda faltam alguns anos para se aposentar.");
		
		}else if(idade>=25&&tempoTrabalho>=30) {
			System.out.println("Obrigado pelos " + getTempoTrabalho() + " anos de contribuição. "
					+ "Aproveite sua merecida aposentadoria");
			
		}else {
			System.out.println("Não é necessário trabalhar");
		}
	}


	@Override
	public void calcularImpostoRenda() {
		if(salario<2000) {
			System.out.println("Você está isento do Imposto de Renda");
		
		}else if(salario>=2000&&salario<=5000) {
			System.out.println("Seu Imposto de Renda é de R$ " + salario*5/100);
			
		}else if(salario>=5000&&salario<=10000){
			System.out.println("Seu Imposto de Renda é de R$ " + salario*10/100);

		}else {
			System.out.println("Seu Imposto de Renda é de R$ " + salario*15/100);

		}
	}

}
