package com.loveincode.dao;

import java.util.List;

//����NewsDao(�ӿ���)
public interface NewsDao {

	public List showAllNews();

	public String findNews();

	public String deleteSingleNews(Integer id);
}
