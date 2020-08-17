package desafioSantander02;

public abstract class Conta {
	
	private double saldo;
	private int idCliente;	
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}	

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public Conta(double saldo, Cliente idCliente) {
		setSaldo(saldo);
		setIdCliente(idCliente.getId());
	}

	public void depositar(double valor) {
		setSaldo(getSaldo() + valor);
		System.out.printf("Deposito de R$ %.2f realizado com sucesso. Seu saldo agora é de: R$ %.2f %n", valor, getSaldo());
	}
	
	public void sacar(double valor) {
		setSaldo(getSaldo() - valor);
	}
	
	public void exibirSaldo() {
		System.out.println("O saldo da conta é de : R$ " + getSaldo());
	}
	
	
	
	

}
