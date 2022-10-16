package Entities;

public class Kurs {
	private String kursName;
	private double kursPrice;
	public Kurs(String kursName, double kursPrice) {
		super();
		this.kursName = kursName;
		this.kursPrice = kursPrice;
	}
	public String getKursName() {
		return kursName;
	}
	public void setKursName(String kursName) {
		this.kursName = kursName;
	}
	public double getKursPrice() {
		return kursPrice;
	}
	public void setKursPrice(double kursPrice) {
		this.kursPrice = kursPrice;
	}
	
	
	
}
