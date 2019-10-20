package aplication;

import java.util.Locale;
import java.util.Scanner;

public class TesteVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de variaveis a verificar: ");
		int n = sc.nextInt();
		
		System.out.println("Variavel : ");
		
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("Altura media: %.2f%n", avg);

		sc.close();
	}

}