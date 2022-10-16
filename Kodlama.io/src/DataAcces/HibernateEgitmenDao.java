package DataAcces;

import Entities.Egitmen;

public class HibernateEgitmenDao implements EgitmenDao{

	@Override
	public void add(Egitmen egitmen) {
		System.out.println("Hibernnate  ile veri tabanina eklendi !!!!!!");
		
	}
	
}
