package javaOO;

public class metodo {
	public static void main(String[] args) {
		
		//conta 1
		conta contaExemplo = new conta();
		contaExemplo.deposita(100);
		contaExemplo.deposita(50);
		contaExemplo.saca(20);
		
		
		//conta 2
		conta contaNova = new conta();
		contaNova.titular = new Cliente();
		
		//atribui um nome a um titular de uma conta
		contaNova.titular.nome = "Marcela";
		contaNova.deposita(1000);
		
		//quero tirar da contaNova e mandar para a contaExemplo
		contaNova.transfere(300, contaExemplo);
		
		
		System.out.println(contaExemplo.pegaSaldo());
		System.out.println(contaNova.titular.nome);
	}
}
