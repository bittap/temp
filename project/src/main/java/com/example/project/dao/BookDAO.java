package com.example.project.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.project.vo.BookVO;

public class BookDAO {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate = null;
	
	/**********************************************************
	 * �˻����
	 * @param �˻����� ���� Ű����
	 * @return ������ ��ȸ �� BookVo����Ʈ return 
	 **********************************************************/
	public List<BookVO> search(String keyWord){
		// sqlSessionTemplate ����ؼ� myBatis ��ȸ �� �־��ּ���
		List<BookVO> list = null;
		return list;
	}
}
