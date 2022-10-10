package oopWithNLayeredApp.business;





import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAcces.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao,Logger[] loggers) {
		super();
		this.loggers=loggers;
		this.productDao = productDao;
	}


	public void add(Product product) throws Exception { // response request pattern nedir ? 	
		// iþ kurallarý yazýlýr business rule
		
		if(product.getUnitPrice()<10) {
			throw new Exception("urun  fiyati 10 dan kucuk olamaz ");
		}
		
		
		
		// burayý yazdýðýmýz da önemli not olarak
		// bit katman baþka bir katmanýn classýný kullanýyorken sadece interfacesinden eriþim kurmalýdýr
		//ProductDao productDao = new HibernateProductDao();
		productDao.add(product);
		
		for(Logger logger : loggers) {
			logger.log(product.getName());
		}
	}
}
