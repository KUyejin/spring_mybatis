package edu.bit.ex.board4;

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

/*
1.root~xml에 아래의 한줄을 추가
    <!-- Mapper Interface-->
    <mybatis-spring: scan base-package="edu.bit.mapper"/>
2. 쿼리를 쓸 xml 생성    
*/

@Controller
public class BController4 {
	
	@Inject
	Bservice4 bservice4;
	
	@RequestMapping("/list4")
	public String list4(Model model) throws Exception {
		System.out.println("list4()");
		
		model.addAttribute("list", bservice4.selectBoardList());		
		
		return"list";
					
	}
	

}
