
public class ContaInvestimento extends ContaBancaria {
	double saldoFinal;
	double rendimento;
	@Override
	public double calcularSaldo() {
		rendimento = saldo * 0.05;
		saldoFinal = saldo + rendimento;
		return saldoFinal;
		
		// ou return saldo -(saldo*0.05); sem as variaveis rendimento e saldo final
	}

}
