package edu.bit.ex.board2;


import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import edu.bit.ex.board1.BDto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//�ι�°���
/*
1. interface�� �ʿ䰡 ���� 
2. sqlSession���� �����ϴ� �Լ�(selectList,selectOne)�� �̿���
3. ���������� ���� XML�� �ʿ�. �ش� XML�� namespace��  �����ڰ��� ����
* 
* */

@Service
public class Bservice2 {
	
	@Inject
	SqlSession sqlSession;
	
	public List<BDto> selectBoardList() throws Exception{
		
		return sqlSession.selectList("board.selectBoardList");
	}	
}
