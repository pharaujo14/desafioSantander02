package desafio02;

public class ContaPoupanca extends Conta {
	
	private double taxaJuros;
	
	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public ContaPoupanca(Cliente idCliente, double saldo, double taxaJuros) {
		super(saldo, idCliente);
		setTaxaJuros(taxaJuros);
	}
	
	@Override
	public void sacar(double valor) {
		if(valor > getSaldo()) {
			System.out.println("Saldo insuficiente");
		} else {
			setSaldo(getSaldo() - valor);
			System.out.printf("Foi realizado o saque de %.2f. O saldo restante é de: %.2f %n", valor, getSaldo());
		}
	}
	
	public void recolherJuros() {
		double lucro = getTaxaJuros() * getSaldo();
		setSaldo(getSaldo() + lucro);
		System.out.printf("Você teve um lucro de R$ %.2f, o saldo atual é de R$ %.2f %n", lucro, getSaldo());
		
	}


}
