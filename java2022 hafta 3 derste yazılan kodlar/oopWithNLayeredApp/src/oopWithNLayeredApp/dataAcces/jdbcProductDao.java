package oopWithNLayeredApp.dataAcces;

import oopWithNLayeredApp.entities.Product;

public class jdbcProductDao implements ProductDao{
	// veritabani erisim islemleri
	public void add(Product product) {
		// sadece ve sadece db erisim kodlar� butaya yaz�l�r SQL bilmek laz�mmmmmmmmmmmm !!!!!!!!!
		System.out.println("JDBC ile veri tabanina eklendi !!!!!!");
	}

}
