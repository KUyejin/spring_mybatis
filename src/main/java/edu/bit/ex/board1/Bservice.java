package edu.bit.ex.board1;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
public class Bservice {
	
	@Inject
	SqlSession sqlSession;
	
	public List<BDto> selectBoardList() throws Exception{
		IBDao dao = sqlSession.getMapper(IBDao.class);
		return dao.listDao();
	}	
	//sqlSession 자체가 마이바티스이다
	//마이바티스 객체 어떻게 생성? SqlSessin도 ioc컨테이너에 있어야 한다. -  root-context.xml
	//getMapper를 통해서 인터페이스를 다이렉트로 집어넣는 방법
    //IBDao.class에 01덩어리를 때려넣는다 -> 동적으로 로딩한다
		
}
