package javaOO;

public class metodo {
	public static void main(String[] args) {
		conta contaExemplo = new conta();
		contaExemplo.saldo = 100;
		
		contaExemplo.deposita(50);
		contaExemplo.saca(20);
		
		System.out.println(contaExemplo.saldo);
	}
}
