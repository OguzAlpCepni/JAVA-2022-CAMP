
public class Customer {

	public int id;
	public String city;
	
	public Customer() {
		System.out.println("musteri nesnesi baslatidi");
	}

	public Customer(int id, String firstName, String lastName, String nationalIdentity, String city) {
		this.id = id;
		this.city = city;
		
		
	}
	
}
