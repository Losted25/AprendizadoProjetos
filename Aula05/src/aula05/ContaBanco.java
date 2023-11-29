package aula05;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	public boolean aberta;
	public boolean status;

public ContaBanco(int n, String t, String d, float s, boolean a) {
	this.numConta = n;
	this.tipo = t;
	this.dono = d;
	this.saldo = s;
	this.aberta = a;
}  
public int getNumConta() {
	return this.numConta;
}
public void setNumConta(int n) {
	this.numConta = n;
}
public String getTipo() {
	return this.tipo;
}
public void setTipo(String t) {
	this.tipo = t;
}
public String getDono() {
	return this.dono;
}
public void setDono(String d) {
	this.dono = d;
}
public float getSaldo() {
	return this.saldo;
}
public void setSaldo(float s) {
	this.saldo = s;
}
public boolean getAberta() {
	return this.aberta;
}
public void setAberta(boolean a) {
	this.aberta = a;
}
public void abrirConta() {
	this.aberta = true;
}
	
public void status() {
	System.out.println("A conta é " + this.getTipo());
	System.out.println("O número da conta é " + this.getNumConta());
	System.out.println("O(A) dono(a) da conta é " + this.getDono());
	System.out.println("Seu saldo bancário é R$ " + this.getSaldo());
	
	if(this.getAberta() == true) {
	System.out.println("A sua conta bancária se encontra aberta");
}else {
	System.out.println("A sua conta bancária se encontra fechada");
}
}			
}
