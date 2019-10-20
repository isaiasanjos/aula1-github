package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;


public class Banco {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Cliente cliente;
		
		System.out.println("------------------Bank Line------------------");
		System.out.println();
		System.out.println("   ---------------Welcome!--------------   ");
		System.out.println();
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Is there an inicial deposit (y/n) ?");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.println("Enter inicial deposit value: ");
			double inicialDeposit = sc.nextDouble();
			cliente = new Cliente(holder, inicialDeposit, number);
		}else {
			cliente = new Cliente(holder, number);
		}
		
		System.out.println();
		System.out.println("Conta Cliente");
		System.out.println(cliente);
// encerramento do processo inicial. Mostra os dados basicos da conta
		
		System.out.println();
		System.out.println("Enter deposit value: ");
		double depositValue = sc.nextDouble();
		cliente.deposit(depositValue);
		System.out.println("Updated balance ...");
		
		
		System.out.println();
		System.out.println("Deseja realizar saque (y/n)?");
		char resp = sc.next().charAt(0);
		if (resp == 'y'){
		System.out.println("Enter withdraw value: ");
		double saqueInicial = sc.nextDouble();
		cliente.withdraw(saqueInicial);
		System.out.println("Updated balance ...");
		System.out.println();
		System.out.println(cliente);
		}else {
			System.out.println(cliente);
		}
		
				
		sc.close();
	}

}
