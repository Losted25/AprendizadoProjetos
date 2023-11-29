package calculo;

public class Estagiario extends Funcionario implements CalculadorImpostoRenda{
	private String mes;
	private int feriados, diasTrab;
	private float auxRef, auxTra, mensalidade, bolsa;
	private boolean bolsistaIntegral;
	
	public void pagarMensalidade(){
		if(bolsistaIntegral) {
			System.out.println("Não é necessário pagar mensalidade, pois você possui bolsa integral");
		}else {
			System.out.println("O valor da sua mensalidade é R$: " + getMensalidade());
		}
	}
	public void salarioBruto() {
		if(bolsistaIntegral){
		System.out.println("Seu salário somado aos benefícios será de R$: " + (getSalario() + auxRef + auxTra));
		System.out.println("O valor do auxílio transporte é R$: " + getAuxTra()+ 
				"\nO valor do auxílio transporte é R$" + getAuxRef() +
				"\nO valor do seu salário bruto é R$: " + getSalario());	
		
		}else {
			System.out.println("O valor do auxílio transporte é R$: " + getAuxTra()+ 
					"\nO valor do auxílio transporte é R$" + getAuxRef() +
					"\nO valor do seu salário bruto é R$: " + getSalario());	
			System.out.println("Seu salário somado aos benefícios será de R$:" + (getSalario() - getMensalidade() + auxRef + auxTra));

		}
		
	}
	
	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public int getFeriados() {
		return feriados;
	}

	public void setFeriados(int feriados) {
		this.feriados = feriados;
	}

	public int getDiasTrab() {
		return diasTrab;
	}

	public void setDiasTrab(int diasTrab) {
		this.diasTrab = diasTrab;
	}

	public float getAuxRef() {
		return auxRef;
	}

	public void setAuxRef(float auxRef) {
		this.auxRef = auxRef;
	}

	public float getAuxTra() {
		return auxTra;
	}

	public void setAuxTra(float auxTra) {
		this.auxTra = auxTra;
	}

	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}

	public boolean isBolsistaIntegral() {
		return bolsistaIntegral;
	}

	public void setBolsistaIntegral(boolean bolsistaIntegral) {
		this.bolsistaIntegral = bolsistaIntegral;
	}

	@Override
	public String getCargo() {
		// TODO Auto-generated method stub
		return super.getCargo();
	}
	@Override
	public void setCargo(String cargo) {
		// TODO Auto-generated method stub
		super.setCargo(cargo);
	}
	@Override
	public String getFuncao() {
		// TODO Auto-generated method stub
		return super.getFuncao();
	}
	@Override
	public void setFuncao(String funcao) {
		// TODO Auto-generated method stub
		super.setFuncao(funcao);
	}
	@Override
	public int getMatricula() {
		// TODO Auto-generated method stub
		return super.getMatricula();
	}
	@Override
	public void setMatricula(int matricula) {
		// TODO Auto-generated method stub
		super.setMatricula(matricula);
	}
	@Override
	public int getTempoTrabalho() {
		// TODO Auto-generated method stub
		return super.getTempoTrabalho();
	}
	@Override
	public void setTempoTrabalho(int tempoTrabalho) {
		// TODO Auto-generated method stub
		super.setTempoTrabalho(tempoTrabalho);
	}
	@Override
	public float getSalario() {
		// TODO Auto-generated method stub
		return super.getSalario();
	}
	@Override
	public void setSalario(float salario) {
		// TODO Auto-generated method stub
		super.setSalario(salario);
	}
	@Override
	public void procurarEmprego() {
		// TODO Auto-generated method stub
		super.procurarEmprego();
	}
	@Override
	public void calcularImpostoRenda() {
		// TODO Auto-generated method stub
		super.calcularImpostoRenda();
	}
	@Override
	public void fazerAniversario() {
		// TODO Auto-generated method stub
		super.fazerAniversario();
	}
	@Override
	public int getIdade() {
		// TODO Auto-generated method stub
		return super.getIdade();
	}
	@Override
	public void setIdade(int idade) {
		// TODO Auto-generated method stub
		super.setIdade(idade);
	}
	@Override
	public int getCpf() {
		// TODO Auto-generated method stub
		return super.getCpf();
	}
	@Override
	public void setCpf(int cpf) {
		// TODO Auto-generated method stub
		super.setCpf(cpf);
	}
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}
	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}
	@Override
	public String getSexo() {
		// TODO Auto-generated method stub
		return super.getSexo();
	}
	@Override
	public void setSexo(String sexo) {
		// TODO Auto-generated method stub
		super.setSexo(sexo);
	}
	@Override
	public boolean isTrabalha() {
		// TODO Auto-generated method stub
		return super.isTrabalha();
	}
	@Override
	public void setTrabalha(boolean trabalha) {
		// TODO Auto-generated method stub
		super.setTrabalha(trabalha);
	}
}
