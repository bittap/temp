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
		// bLogic를 사용해서 List<BookVO>에 값을 일단 넣어주세요
		
		// List<BookVO>를 Json 파싱해주세요
		
		// Json 파싱한 값을 String으로 변환해서 list페이지에 보내주세요
		return "/board/list";
	}
	
	@RequestMapping(value = "book")
	public ModelAndView list() {
		// 넘기는 값이 없으므로 ModelAndView에 url만 넣어서 redirect해주세요
		return null;
	}
}
