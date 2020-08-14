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
	//sqlSession ��ü�� ���̹�Ƽ���̴�
	//���̹�Ƽ�� ��ü ��� ����? SqlSessin�� ioc�����̳ʿ� �־�� �Ѵ�. -  root-context.xml
	//getMapper�� ���ؼ� �������̽��� ���̷�Ʈ�� ����ִ� ���
    //IBDao.class�� 01����� �����ִ´� -> �������� �ε��Ѵ�
		
}
