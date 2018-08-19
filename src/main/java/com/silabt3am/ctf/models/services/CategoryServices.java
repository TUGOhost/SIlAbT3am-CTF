package com.silabt3am.ctf.models.services;
import java.util.List;
import com.silabt3am.ctf.pojo.Categories;

public interface CategoryServices {
	
	public List<Categories> selectAllCategory();
	
	public Categories selectById(Long id);

	public int insertNewCategory(Categories cate);
	
	public int deleteCategoryById(Long id);
	
	public int updateCategory(Categories cate);
	
}
