
public class Aplicacao {

	public static void main(String[] args) {
		ContaBancaria cc = new ContaCorrente();
		cc.depositar(1000);
		cc.sacar(200);
		double saldo = cc.calcularSaldo();
		System.out.println("Saldo da Conta Corrente = " + saldo);
		
		ContaBancaria ci = new ContaInvestimento();
		ci.depositar(1000);
		ci.sacar(200);
		saldo = ci.calcularSaldo();
		System.out.println("Saldo da Conta Investimento = " + saldo);
		
		cc.transferir(100, ci);
		saldo = cc.calcularSaldo();
		System.out.println("Saldo da Conta Corrente = " + saldo);
		saldo = ci.calcularSaldo();
		System.out.println("Saldo da Conta Investimento = " + saldo);
		

	}

}
