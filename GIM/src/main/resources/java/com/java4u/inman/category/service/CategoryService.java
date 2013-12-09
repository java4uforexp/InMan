/**
 * 
 */
package com.java4u.inman.category.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.java4u.inman.category.beans.Category;


/**
 * @author Bharath
 *
 */

public interface CategoryService {

	public Category saveCategory(Category category);
	
	public Category updateCategory(Category category);
	
	public void deleteCategory(Long categoryId);
	
	public Category getCategory(Long categoryId);
	
	public Category getCategoryByName(String categoryName);
	
	public List<Category> getCategories();
}
