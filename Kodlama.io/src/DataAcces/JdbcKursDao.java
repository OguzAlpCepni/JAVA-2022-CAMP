package DataAcces;

import Entities.Kurs;

public class JdbcKursDao implements KursDao{

	@Override
	public void add(Kurs kurs) {
		System.out.println("Jdbc  ile veri tabanina eklendi !!!!!!");
		
	}

}
