package oopWithNLayeredApp.dataAcces;

import oopWithNLayeredApp.entities.Product;

public class jdbcProductDao implements ProductDao{
	// veritabani erisim islemleri
	public void add(Product product) {
		// sadece ve sadece db erisim kodları butaya yazılır SQL bilmek lazımmmmmmmmmmmm !!!!!!!!!
		System.out.println("JDBC ile veri tabanina eklendi !!!!!!");
	}

}
