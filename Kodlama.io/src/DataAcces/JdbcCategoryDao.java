package DataAcces;

import Entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Jdbc  ile veri tabanina eklendi !!!!!!");
		
	}

}
