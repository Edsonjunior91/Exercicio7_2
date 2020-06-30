
public class ContaCorrente extends ContaBancaria {
	double saldoFinal;
	double imposto;
	@Override
	public double calcularSaldo() {
		imposto = saldo * 0.1;
		saldoFinal = saldo - imposto;
		return saldoFinal;
	}

}
