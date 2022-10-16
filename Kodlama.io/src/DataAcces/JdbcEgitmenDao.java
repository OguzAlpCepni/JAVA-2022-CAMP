package DataAcces;

import Entities.Egitmen;

public class JdbcEgitmenDao implements EgitmenDao{

	@Override
	public void add(Egitmen egitmen) {
		System.out.println("Jdbc  ile veri tabanina eklendi !!!!!!");
		
	}
	
}
