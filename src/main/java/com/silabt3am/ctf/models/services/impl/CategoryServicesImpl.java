package com.silabt3am.ctf.models.services.impl;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.silabt3am.ctf.models.dao.CategoriesMapper;
import com.silabt3am.ctf.models.services.CategoryServices;
import com.silabt3am.ctf.pojo.Categories;

@Service("CategoryServices")
public class CategoryServicesImpl implements CategoryServices{

	@Resource
	private CategoriesMapper categoriesMapper;

	public List<Categories> selectAllCategory() {

		return categoriesMapper.selectAll();
	}

	public Categories selectById(Long id) {

		return categoriesMapper.selectByPrimaryKey(id);
	}

	@Override
	public int insertNewCategory(Categories cate) {

		return categoriesMapper.insert(cate);
	}

	@Override
	public int deleteCategoryById(Long id) {

		return categoriesMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateCategory(Categories cate) {

		return categoriesMapper.updateByPrimaryKey(cate);
	}
	
}
