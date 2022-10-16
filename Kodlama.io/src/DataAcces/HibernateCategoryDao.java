package DataAcces;

import Entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hibernnate  ile veri tabanina eklendi !!!!!!");
		
	}

}
