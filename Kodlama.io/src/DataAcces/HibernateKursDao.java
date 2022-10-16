package DataAcces;

import Entities.Kurs;

public class HibernateKursDao implements KursDao{

	@Override
	public void add(Kurs kurs) {
		System.out.println("Hibernnate  ile veri tabanina eklendi !!!!!!");
		
	}
	
}
