package edu.bit.ex.board1;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//첫번째 방법
//1. interface IBDao를 XML namespace에 맵핑<mapper namespace = "edu.bit.ex.board1.IBDao">
//2. sqlSession.getMapper(IBDao.class)를 이용

@Controller
public class BController {
	
	@Inject
	Bservice bservice;
	
	@RequestMapping("/list")
	public String list(Model model) throws Exception {
		System.out.println("list()");
		
		model.addAttribute("list", bservice.selectBoardList());		
		
		return"list";
					
	}
	

}
