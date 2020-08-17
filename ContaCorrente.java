package desafio02;

public class ContaCorrente extends Conta {
	
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public ContaCorrente(double saldo, Cliente idCliente, double limite) {
		super(saldo, idCliente);
		setLimite(limite);
	}
	
	public void depositarCheque(double valor, String banco, String data) {
		setSaldo(valor + getSaldo());
		System.out.printf("O cheque com valor R$ %.2f, do banco %s, vai estar compensado em %s, saldo provisório de R$ %.2f %n", valor, banco, data, getSaldo());
	}
	
	@Override
	public void sacar(double valor) {
		if(valor < getSaldo()) {
			setSaldo(getSaldo() - valor); 
			System.out.printf("Realizado um saque de R$ %.2f, saldo atual de R$ %.2f %n", valor, getSaldo());
		} else if (valor < getSaldo() + getLimite()) {
			setSaldo(getSaldo() - valor);
			setLimite(getSaldo() + getLimite());	
			System.out.printf("Realizado um saque de R$ %.2f, seu saldo não era suficiente e você está utilizando o limite. Seu saldo atual é de %.2f e seu limite é de R$ %.2f %n", valor, getSaldo(), getLimite());
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
}
