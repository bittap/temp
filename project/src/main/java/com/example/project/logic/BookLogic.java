package com.example.project.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.project.dao.BookDAO;
import com.example.project.vo.BookVO;

public class BookLogic {
	@Autowired
	BookDAO bDAO;
	
	/**********************************************************
	 * dao��� ȣ��
	 * @param �˻����� ���� Ű����
	 * @return BookDAO�� ������ �� Return
	 **********************************************************/
	public List<BookVO> search(String keyWord){
		// bDAO�� ����ؼ� search�޼ҵ带 ����ؼ� �����ϼ���
		return null;
	}
}
