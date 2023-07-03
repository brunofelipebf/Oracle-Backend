package javaOO;

public class criaConta {

	public static void main(String[] args) {
		//primeira conta
		conta primeiraConta = new conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		
		//segunda conta
		conta segundaConta = new conta();
		segundaConta.saldo = 50;
	}

}
