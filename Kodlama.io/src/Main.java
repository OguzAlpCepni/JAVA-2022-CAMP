import Business.CategoryManager;
import Business.EgitmenManager;
import Business.KursManager;
import Core.DatabaseLogger;
import Core.EmailLogger;
import Core.FileLogger;
import Core.Logger;
import DataAcces.HibernateEgitmenDao;
import DataAcces.HibernateKursDao;
import DataAcces.JdbcCategoryDao;
import Entities.Category;
import Entities.Egitmen;
import Entities.Kurs;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Egitmen egitmen1 = new Egitmen("oguz alp","cepni");
		Category category1 = new Category("egitim");
		Kurs kurs1 = new Kurs("java",200);
		
		Logger [] loggers = {new DatabaseLogger(),new FileLogger(),new EmailLogger()};
		EgitmenManager egitmenManager= new EgitmenManager(new HibernateEgitmenDao(),loggers);
		egitmenManager.add(egitmen1);
		System.out.println("--------------------------------------------------------------------------");
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category1);
		System.out.println("--------------------------------------------------------------------------");
		KursManager kursManager = new KursManager(new HibernateKursDao(), loggers);
		kursManager.add(kurs1);
	
	}

}
