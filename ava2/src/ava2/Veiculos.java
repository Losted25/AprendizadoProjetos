package ava2;

import java.util.Scanner;

public class Veiculos {
	//Atributos
	protected int capacidadeTanque, numeroPassageiros;
	protected float preco;
	
	//Métodos
	public Veiculos(int capacidadeTanque, int numeroPassageiros, float preco) {
		super();
		this.capacidadeTanque = 0;
		this.numeroPassageiros = 0;
		this.preco = 0.0f;
	}
			
	public Veiculos() {
		super();
		
	}
	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}
	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	public int getNumeroPassageiros() {
		return numeroPassageiros;
	}
	public void setNumeroPassageiros(int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public void imprimir() {
		System.out.println("Capacidade de tanque: " + this.capacidadeTanque);
		System.out.println("O número de passageiros é: " + this.numeroPassageiros);
		System.out.println("O preço é: " + this.preco);
		
	} 
	public void entradaDados() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a capacidade do tanque: ");
		capacidadeTanque = scanner.nextInt();
		
		System.out.println("Digite o número de passageiros: ");
		numeroPassageiros = scanner.nextInt();
		
		System.out.println("Digite o preço da passagem: ");
		preco = scanner.nextFloat();
		
		scanner.close();
	}
	
}
