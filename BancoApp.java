package desafioSantander02;

public class BancoApp {
	public static void main(String[] args) {
		Cliente cliente01 = new Cliente(01, "Silva", "28.997.644-3", "008.971.432-64");
		System.out.println(cliente01);
		ContaPoupanca cp1 = new ContaPoupanca(cliente01, 100.0, 0.02);
		cp1.recolherJuros();
		cp1.depositar(20.0);
		cp1.sacar(30.0);
		ContaCorrente cc1 = new ContaCorrente(100.00, cliente01, 200.00);
		cc1.depositar(50.00);
		cc1.depositarCheque(50.00, "Ita�", "17/08/2020");
		cc1.sacar(150.00);
		cc1.sacar(100.00);
		cc1.depositar(60.00);
		cc1.sacar(300.00);
	}

}
