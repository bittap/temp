package com.example.project.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.project.vo.BookVO;

public class BookDAO {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate = null;
	
	/**********************************************************
	 * 검색기능
	 * @param 검색했을 때의 키워드
	 * @return 데이터 조회 후 BookVo리스트 return 
	 **********************************************************/
	public List<BookVO> search(String keyWord){
		// sqlSessionTemplate 사용해서 myBatis 조회 후 넣어주세요
		List<BookVO> list = null;
		return list;
	}
}
