
public class CustomerManager {
	
	private Customer customer;
	CreditManagerr creditManagerr;
	public CustomerManager(Customer customer ,CreditManagerr creditManagerr) {
		this.customer = customer;
		this.creditManagerr=creditManagerr;
	}
	public void save() {
		System.out.println("kaydedildi");
	}
	public void delete() {
		System.out.println("musteri silindi ");
	}
	public void giveCredit() {
		creditManagerr.calculate();
		System.out.println("kredi verildi");
	}
}
