package javaOO;

public class conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;}
	
	void saca(double valor) {
		if(saldo >= valor) {
			this.saldo = this.saldo - valor;
		} else {
			System.out.println("Fundos Insuficientes");
		}
	}
	
	public boolean transfere(double valor, conta destino){
	    if(this.saldo >= valor){
	        this.saldo -= valor;
	        destino.deposita(valor);    
	        return true;
	    }
	    return false;
	}
}