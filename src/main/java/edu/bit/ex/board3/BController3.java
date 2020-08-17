package edu.bit.ex.board3;

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

/*1.인터페이스 위에 @을 붙이는 형식임
2.XML이 필요없음, sqlSession개체 필요없음
3.root~xml에 아래의 한줄을 추가
    <!-- Mapper Interface-->
    <mybatis-spring: san base-package="edu.bit.mapper"/>
4.쿼리가 길어지면 사용하기 힘듬*/

@Controller
public class BController3 {
	
	@Inject
	Bservice3 bservice3;
	
	@RequestMapping("/list3")
	public String list3(Model model) throws Exception {
		System.out.println("list3()");
		
		model.addAttribute("list", bservice3.selectBoardList());		
		
		return"list";
					
	}
	

}
