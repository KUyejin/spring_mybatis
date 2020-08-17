package edu.bit.ex.board4;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import edu.bit.ex.board1.BDto;

public interface BoardMapper4 {

	
	public List<BDto> selectList();
	
	@Select("select * from mvc_board order by bGroup desc, bStep asc") 
	public List<BDto> selectList2();
	
	//3번과 4번 같이 사용해도 된다.
}
