
public abstract class ContaBancaria {
	protected double saldo;
	
	
	public void depositar(double valor) {
		saldo+=valor;
	}
	public void sacar(double valor) {
		saldo-=valor;
	}
	public void transferir(double valor , ContaBancaria conta ) {
		sacar(valor);
		conta.depositar(valor);
	}
	// Calcula o saldo final, que pode sofrer variação do valor armazenado no atributo
	// 'saldo'. Cada subclasse deve implementar este método de acordo com suas regras de cálculo
	public abstract double calcularSaldo();
}
