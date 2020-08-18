package desafioSantander02;

public class BancoApp {
	public static void main(String[] args) {
		Cliente cliente01 = new Cliente(01, "Silva", "99.999.999-9", "999.999.999-99");
		System.out.println(cliente01);
		System.out.println("-----------------------------------------");
		System.out.println("Usando conta poupança");
		System.out.println("-----------------------------------------");
		ContaPoupanca cp1 = new ContaPoupanca(cliente01, 100.0, 0.02);
		cp1.recolherJuros();
		cp1.depositar(20.0);
		cp1.sacar(30.0);
		cp1.sacar(100.00);
		ContaCorrente cc1 = new ContaCorrente(100.00, cliente01, 200.00);
		System.out.println("-----------------------------------------");
		System.out.println("Usando conta corrente");
		System.out.println("-----------------------------------------");
		cc1.depositar(50.00);
		cc1.depositarCheque(50.00, "Itaú", "17/08/2020");
		cc1.sacar(150.00);
		cc1.sacar(100.00);
		cc1.depositar(60.00);
		cc1.sacar(300.00);
	}

}
