package com.example.project.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.project.dao.BookDAO;
import com.example.project.vo.BookVO;

public class BookLogic {
	@Autowired
	BookDAO bDAO;
	
	/**********************************************************
	 * dao기능 호출
	 * @param 검색했을 때의 키워드
	 * @return BookDAO에 가져온 값 Return
	 **********************************************************/
	public List<BookVO> search(String keyWord){
		// bDAO를 사용해서 search메소드를 사용해서 리턴하세요
		return null;
	}
}
