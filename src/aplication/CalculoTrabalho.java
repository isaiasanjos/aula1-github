package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class CalculoTrabalho {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Funcionario rect = new Funcionario();
		
		System.out.println("Informe as medidas do Retangulo");

		
		System.out.println("Enter height");
		rect.height = sc.nextDouble(); //altura
				
		System.out.println("Enter widht");
		rect.widht = sc.nextDouble();//largura
		
		
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETRO = %.2f%n", rect.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", rect.diag());
		
		sc.close();

	}

}
