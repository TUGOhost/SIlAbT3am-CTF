package com.silabt3am.ctf.models.services;
import java.util.Date;
import java.util.List;
import com.silabt3am.ctf.pojo.News;

public interface NewsServices {
	public News getNewsById(long id); //查询新闻
	
	public int createNews(String title,String content,Date posttime);
	
	public List<News> selectAll();
	
	public int updateNews(News newNews);
	
	public int deleteNewsById(long id);
	
	
}