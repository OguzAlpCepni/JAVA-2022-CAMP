package Business;

import java.util.ArrayList;
import java.util.List;

import Core.Logger;
import DataAcces.CategoryDao;
import Entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private List<Category> categories = new ArrayList<>();
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception{
		for(Category categories : categories) {
			if(categories == category) {
				System.out.println("kayitli kurs eklenemez");
			}
		}
		categories.add(category);
		categoryDao.add(category);
		for(Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
		
	}
	
	

}
