package bytebank_herdado;

public class testeFuncionario {
	public static void main(String[] args) {
		Funcionario bruno = new AuxAdm();
		Gerente Sousa = new Gerente();
		
		//senha para teste
		int senha = 12;
		
		bruno.setNome("Bruno");	
		bruno.setCpf("12345678919");
		bruno.setSalario(1400);
		bruno.setTipo(2);
		
		
		System.out.println(bruno.getNome());
		System.out.println(bruno.getBonificacao());
		System.out.println(bruno.getSalario());
		System.out.println();
		
		Sousa.setNome("Sousa");
		Sousa.setSenha(2556);
		Sousa.setSalario(2500);
		boolean autenticou = Sousa.autentica(senha);
		
		System.out.println(Sousa.getNome());
		System.out.println(autenticou);
		System.out.println(Sousa.getSalario());
		
	}
		
}
