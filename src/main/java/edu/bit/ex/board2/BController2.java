package edu.bit.ex.board2;

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



@Controller
public class BController2 {
	
	@Inject
	Bservice2 bservice2;
	
	@RequestMapping("/list2")
	public String list(Model model) throws Exception {
		System.out.println("list2()");
		
		model.addAttribute("list", bservice2.selectBoardList());		
		
		return"list";
					
	}
	

}
