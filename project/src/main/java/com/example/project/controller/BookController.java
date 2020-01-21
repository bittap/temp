package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.project.logic.BookLogic;
import com.example.project.vo.BookVO;

@Controller
@RequestMapping(value = "/board/")
public class BookController {
	
	@Autowired
	BookLogic bLogic;
	
	@RequestMapping(value = "search")
	public String search(@RequestParam(value = "serachString") String keyWord) {
		// bLogic�� ����ؼ� List<BookVO>�� ���� �ϴ� �־��ּ���
		
		// List<BookVO>�� Json �Ľ����ּ���
		
		// Json �Ľ��� ���� String���� ��ȯ�ؼ� list�������� �����ּ���
		return "/board/list";
	}
	
	@RequestMapping(value = "book")
	public ModelAndView list() {
		// �ѱ�� ���� �����Ƿ� ModelAndView�� url�� �־ redirect���ּ���
		return null;
	}
}
