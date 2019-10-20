package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;

public class EmpresaNova {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Empregado> list = new ArrayList<>();
		
		
		System.out.println("==============FORMULÁRIO================");
		System.out.println();
		System.out.println("QUANTIDADE DE FUNCIONARIOS ADIMITIDOS: ");
		
		
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
		System.out.println();
		System.out.println("FUNCIONÁARIO #" + i + ": ");
		System.out.println("ID: ");
		Integer id = sc.nextInt();
		System.out.println("NOME: ");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.println("SALARIO: ");
		double price = sc.nextDouble();
		list.add(new Empregado(id, name, price));
		
		
		
		System.out.println("fUNCIONÁRIO CADASTRADO COM SUCESSO");
		System.out.println();
		}
		
		System.out.println("Deseja realizar ajuste de pagamento ? (y/n)");
		char resp = sc.next().charAt(0);
		//sc.nextLine();
				if(resp == 'y') {
				System.out.println("ID-FUNCIONARARIO: ");
				int num = sc.nextInt();
				sc.nextLine();			
				Empregado emp = list.stream().filter(x -> x.getId() == num).findFirst().orElse(null);
					if(emp == null) {
						System.out.println("FUNCIONÁRIO NÃO CADASTRADO NO SISTEMA");
					}else {
						System.out.println("INFORME A PORCENTAGEM : ");
						double porcentagem = sc.nextDouble();
						emp.Ajuste(porcentagem);
					}
				}else {
					
				
					System.out.println();
					System.out.println("Lista de funcionarios: ");
					for(Empregado obj : list){
						System.out.println(obj);
					}
				}
				System.out.println();
				System.out.println("Lista de funcionarios: ");
				for(Empregado obj : list){
					System.out.println(obj);
			
		}
sc.close();		

	}
}
