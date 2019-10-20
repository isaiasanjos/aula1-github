package entities;

public class Funcionario {


	public double height;//altura
	public double widht; //largura
	
	public double area() {
		return height * widht;
	}
	
	public double perimetro() {
		return (widht + height) * 2;
	}
	
	public double diag() {		
	return Math.sqrt((height * height) + (widht * widht));
	}
	
 
	
}
