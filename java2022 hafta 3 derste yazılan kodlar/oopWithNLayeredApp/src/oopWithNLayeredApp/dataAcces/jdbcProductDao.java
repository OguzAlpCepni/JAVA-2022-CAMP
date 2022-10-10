package oopWithNLayeredApp.dataAcces;

import oopWithNLayeredApp.entities.Product;

public class jdbcProductDao implements ProductDao{
	// veritabani erisim islemleri
	public void add(Product product) {
		// sadece ve sadece db erisim kodlarý butaya yazýlýr SQL bilmek lazýmmmmmmmmmmmm !!!!!!!!!
		System.out.println("JDBC ile veri tabanina eklendi !!!!!!");
	}

}
