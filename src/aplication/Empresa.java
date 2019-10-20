package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Colaborador;

public class Empresa {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Colaborador colab = new Colaborador();
		
		
		System.out.println("Informe os dados a seguir: ");
		
		System.out.println("Digite o Nome do colaborador: ");
		colab.nome = sc.nextLine();	
		colab.nome = sc.nextLine();
		
		System.out.println("Informe o salario bruto");
		 	colab.salariobruto = sc.nextDouble();
			
		System.out.println("Informe a taxa de imposto");
		 	colab.taxa = sc.nextDouble();
		 	
		
		 System.out.printf("Colaborador: ", colab.nome);
		 System.out.printf("Salario bruto: $ ", colab.salariobruto());
		 System.out.printf("% Imposto a descontar: ", colab.imposto());
		 System.out.printf("Salario liquido a receber: $ ", colab.salarioliquido());
		 
		 
			
		

	}

}
