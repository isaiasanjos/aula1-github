package entities;

import javax.xml.crypto.Data;

public class HourContract {
	private Data date;
	private double valuePerHour;
	private Integer hours;
	
	public HourContract() {
	}

	
	public HourContract(Data date, double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}


	public Data getDate() {
		return date;
	}


	public void setDate(Data date) {
		this.date = date;
	}


	public double getValuePerHour() {
		return valuePerHour;
	}


	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}


	public Integer getHours() {
		return hours;
	}


	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	
}
