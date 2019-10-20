package aplication;

import java.util.Scanner;
import entities.Pousada;

public class Hospedagem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
			Pousada[] vect = new Pousada[10];
		
			System.out.println("How may rooms will be rented? ");
			int n = sc.nextInt();
			
			for(int i = 1; i <= n; i++) {
			System.out.println();
			System.err.println("Name: ");
			System.out.println("Rent #" + i + ":");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			vect[room] = new Pousada(name, email);
			}
			
			System.out.println();
			System.out.println("Busy rooms: ");
			for (int i=0; i<10; i++) {
				if (vect[i] != null) {
					System.out.println(i + ": " + vect[i]);
				}
			}

		
		sc.close();
	

}
}