
public class Main {

	public static void main(String[] args) {
		//CreditManager creditManager = new CreditManager();
		//creditManager.colculate();
		//creditManager.save();
		//System.out.println("-------------------------------------------------------------------------");
		//Customer customer = new Customer();
		//customer.id = 1;
	
		//customer.city="afyon";
		
		//CustomerManager customerManager = new CustomerManager(customer);
		//customerManager.save();
		//customerManager.delete();
		
		System.out.println("--------------------------------------------------------------------------");
		
		Company company = new Company();
		company.taxNumber="100000";
		company.companyName="arcelik";
		company.id=100;
		
		//CustomerManager customerManager2= new CustomerManager(new Company());
		//Person person = new Person();
		//person.nationalIdentity="1212";
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.giveCredit();
		

	}

}
