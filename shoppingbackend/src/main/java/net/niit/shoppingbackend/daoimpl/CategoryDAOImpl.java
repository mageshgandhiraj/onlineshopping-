package net.niit.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.niit.shoppingbackend.dao.CategoryDAO;
import net.niit.shoppingbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {

		Category category = new Category();

		// adding 1st category
		category.setId(1);
		category.setName("Mobile's");
		category.setDescription("this is Iphone");
		category.setImageURL("1.png");

		categories.add(category);
		
	

		// adding 2nd category
		category = new Category();
		category.setId(2);
		category.setName("Laptop's And Desktop's");
		category.setDescription("this is mac laptops and desktops");
		category.setImageURL("2.png");

		categories.add(category);


		// adding 3nd category
		category = new Category();
		category.setId(3);
		category.setName("watch's And OtherProduct's");
		category.setDescription("this is watches and other products ");
		category.setImageURL("3.png");

		categories.add(category);

	}

@Override
	public List<Category> list() {
		
		return categories;
	}

@Override
public Category get(int id) {
	
	for(Category category : categories) {
		
		if(category.getId() == id) return category;
	}
	return null;
}
}
