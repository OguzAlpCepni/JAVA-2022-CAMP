package oopWithNLayeredApp.dataAcces;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
	public void add(Product product) {
		
		System.out.println("Hibernnate  ile veri tabanina eklendi !!!!!!");
	}
}
