package com.silabt3am.ctf.models.services.impl;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.silabt3am.ctf.models.dao.NewsMapper;
import com.silabt3am.ctf.models.services.NewsServices;
import com.silabt3am.ctf.pojo.News;
@Service("NewsServices")
public class NewsServiceImpl implements NewsServices{

	@Resource
	private NewsMapper newsMapper;

	public News getNewsById(long id) {
		return newsMapper.selectByPrimaryKey(id);
	}

	public int createNews(String title, String content, Date posttime) {
		// TODO Auto-generated method stub
		News aNews = new News();
		aNews.setTitle(title);
		aNews.setContent(content);
		aNews.setPosttime(posttime);
		return newsMapper.insert(aNews);
	}

	public List<News> selectAll() {
		// TODO Auto-generated method stub
		return newsMapper.selectAll();
	}

	public int updateNews(News newNews) {
		// TODO Auto-generated method stub
		return newsMapper.updateByPrimaryKey(newNews);
	}

	public int deleteNewsById(long id) {
		// TODO Auto-generated method stub
		return newsMapper.deleteByPrimaryKey(id);
	}
	
}

