package ava2;

import java.util.InputMismatchException;
import java.util.Scanner;

	public class Aviao extends Veiculos {
	//Atributos
	private String prefixo, dataRevisao;

	//Métodos
	public Aviao(int capacidadeTanque, int numeroPassageiros, float preco, String prefixo, String dataRevisao) {
		super(capacidadeTanque, numeroPassageiros, preco);
		this.prefixo = prefixo;
		this.dataRevisao = dataRevisao;
	}

	public Aviao() {
		super();
	}

	public String getPrefixo() {
		return prefixo;
	}

	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}

	public String getDataRevisao() {
		return dataRevisao;
	}

	public void setDataRevisao(String dataRevisao) {
		this.dataRevisao = dataRevisao;
	}

	@Override
	public int getCapacidadeTanque() {
		return super.getCapacidadeTanque();
	}

	@Override
	public void setCapacidadeTanque(int capacidadeTanque) {
		super.setCapacidadeTanque(capacidadeTanque);
	}

	@Override
	public int getNumeroPassageiros() {
		return super.getNumeroPassageiros();
	}

	@Override
	public void setNumeroPassageiros(int numeroPassageiros) {
		super.setNumeroPassageiros(numeroPassageiros);
	}

	@Override
	public float getPreco() {
		return super.getPreco();
	}

	@Override
	public void setPreco(float preco) {
		super.setPreco(preco);
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Prefixo: " + this.prefixo);
		System.out.println("O número de passageiros é: " + this.dataRevisao);
	}

	@Override
	public void entradaDados() {
		super.entradaDados();
		Scanner scanner = new Scanner(System.in);
	try {
		System.out.println("Digite o prefixo do avião: ");
		prefixo = scanner.nextLine();
		
		System.out.println("Digite a data de Revisão: ");
		dataRevisao = scanner.nextLine();
		
	}catch(InputMismatchException e) {
		System.err.println("Erro!");
		scanner.nextLine();
	}catch(Exception e) {
		System.err.println("Erro desconhecido!");
	}finally{
		scanner.close();
	}
}
	public void reajustarPreco(double percentual) {
		this.preco += preco * (percentual/100.0);
	}	
	

}
