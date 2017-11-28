package net.niit.shoppingbackend.dao;

import java.util.List;


import net.niit.shoppingbackend.dto.Category;


public interface CategoryDAO {

	
	List<Category> list();
	Category get(int id);
}
