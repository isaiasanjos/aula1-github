package entities;

public class Empregado {
	
	public Integer id;
	public String name;
	private double price;
	
	
	
	public Empregado(Integer id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Empregado() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	};
		
	public void Ajuste(double porcentagem) {
		price += price * porcentagem / 100;
	}

	public String toString() {
	return id + ", " + name + ", " + String.format("%.2f", price);  
}

	
}
