package ava2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Navio extends Veiculos{
	//Atributos
	private String nome, dataLancamento;
	private int numeroTripulantes;
	
	
	public Navio(int capacidadeTanque, int numeroPassageiros, float preco, String nome, String dataLancamento,
			int numeroTripulantes) {
		super(capacidadeTanque, numeroPassageiros, preco);
		this.nome = nome;
		this.dataLancamento = dataLancamento;
		this.numeroTripulantes = numeroTripulantes;
	}
	public Navio() {
		super();

	}
	public Navio(int capacidadeTanque, int numeroPassageiros, float preco) {
		super(capacidadeTanque, numeroPassageiros, preco);
		this.nome = "";
		this.numeroTripulantes = 0;
		this.dataLancamento ="";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public int getNumeroTripulantes() {
		return numeroTripulantes;
	}
	public void setNumeroTripulantes(int numeroTripulantes) {
		this.numeroTripulantes = numeroTripulantes;
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
		System.out.println("O nome do navio é: " + this.nome);
		System.out.println("A data de lançamento será: " + this.dataLancamento);
		System.out.println("O número de tripulantes é: " + this.numeroTripulantes);
	}
	@Override
	public void entradaDados() {
		super.entradaDados();
		Scanner scanner = new Scanner(System.in);
		
	try {	
		System.out.println("Digite o nome do navio: ");
		nome = scanner.nextLine();
		
		System.out.println("Digite o número de tripulantes: ");
		numeroTripulantes = scanner.nextInt();
		scanner.nextLine(); // Consome o caractere de nova linha

		System.out.println("Digite a data de Lançamento: ");
		dataLancamento = scanner.nextLine();

	}catch(InputMismatchException e) {
		System.err.println("Erro!");
		scanner.nextLine();
	}catch(Exception e) {
		System.err.println("Erro desconhecido!");
	}finally{
		scanner.close();
	}
}
	public double passageirosPorTripulantes() {
		return numeroPassageiros/numeroTripulantes;
	
	}
}
