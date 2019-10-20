package entities;

public class Colaborador {
	
	public String nome;
	public double salario;
	public double taxa;
	public double salariobruto;
	
	public double imposto() {
		return salario * taxa;
	}
	
	public double salarioliquido() {
		return salario - (salario * taxa);
	}
		
		public double salariobruto() {
		return salarioliquido();
	}

}