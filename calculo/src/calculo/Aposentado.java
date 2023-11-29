package calculo;

public class Aposentado  extends Funcionario implements CalculadorImpostoRenda{
	private float gastos;
	
	public float getGastos() {
		return gastos;
	}

	public void setGastos(float gastos) {
		this.gastos = gastos;
	}
	
	public void gastar() {
		System.out.println("Você gastou R$ " + this.gastos + " do seu salário.");
		
		if(gastos>salario) {
			System.out.println("Você gastou mais do que o seu salário."
					+ " Por isso, seu saldo está negativo."
					+ "\nSeu saldo atual é de R$ "  + (salario - gastos));
		
		}else {
			System.out.println(" Sobrou do seu salário R$ " + (salario-gastos));
		}
	}

	
}
