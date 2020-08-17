package edu.bit.ex.board3;


import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import edu.bit.ex.board1.BDto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Service
public class Bservice3 {
	
	@Inject
	BoardMapper3 boardMapper;
	
	public List<BDto> selectBoardList() throws Exception{
		
		return boardMapper.selectList();
	}	
}
