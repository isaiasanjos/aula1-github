package entities;

public class Cliente {
	
	String holder;
	private double balance;
	private int number;
	public Cliente(String holder, int number) {
		this.holder = holder;
		this.number = number;
	}
	public Cliente(String holder, double inicialDeposit, int number) {
		this.holder = holder;
		deposit(inicialDeposit);
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	public int getNumber() {
		return number;
	}

	public void deposit(double amount) {
		balance+= amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	public String toString() {
		return "Conta: " + number
				+	" , " 
				+ "User: " + holder
				+ " , " 
				+ "Balance R$ " + String.format("%.2f", balance);}
		

}