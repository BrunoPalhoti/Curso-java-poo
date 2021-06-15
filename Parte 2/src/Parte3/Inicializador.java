package Parte3;

public class Inicializador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc1 = new ContaCorrente(1);
		ContaCorrente cc2 = new ContaCorrente(2);
		
		cc1.depositar(500);
		System.out.println("Saldo da Conta Corrente "+ cc1.getNunCC() +": R$ " + cc1.getSaldoCC());
		cc1.sacar(400);
		cc1.depositar(1000);
		System.out.println("Saldo da Conta Corrente "+ cc1.getNunCC() +": R$ " + cc1.getSaldoCC()); 
		
		System.out.println("===================================================================");
		
		cc2.depositar(500);
		System.out.println("Saldo da Conta Corrente "+ cc2.getNunCC() +": R$ " + cc2.getSaldoCC());
		cc2.sacar(400);
		cc2.depositar(1000);
		System.out.println("Saldo da Conta Corrente "+ cc2.getNunCC() +": R$ " + cc2.getSaldoCC()); 
	}

}
