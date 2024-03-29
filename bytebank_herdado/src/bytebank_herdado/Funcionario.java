package bytebank_herdado;

public abstract class Funcionario {
	private String nome;
	private String cpf;
	protected double salario;
	private int tipo = 0; //0 comum 1 gerente 2 Diretor

	public double getBonificacao() {
		
		if(this.tipo == 0) {
			return this.salario * 0.1;
		}else if(this.tipo == 1){
			return this.salario * 0.2;	
		}else {
			return this.salario * 0.3;
		}
	}	
	
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
