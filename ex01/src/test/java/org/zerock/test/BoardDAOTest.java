package org.zerock.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}) //이 경로에 xml파일을 이용해서 스프링이 로딩

public class BoardDAOTest {
	
@Inject
private BoardDAO dao;

	private static final Logger logger =
			LoggerFactory.getLogger(BoardDAOTest.class);
	
	@Test
	public void testCreate() throws Exception{
		BoardVO board = new BoardVO();
		board.setTitle("새로운 글을 넣었습니다");
		board.setContent("새로운 내용");
		board.setWriter("user11");
		dao.create(board);
		
		
	}
	
 @Test
	public void testRead() throws Exception{
		
		logger.info(dao.read(4).toString());
	}

	@Test
	public void testUpdate() throws Exception{
		
		BoardVO board = new BoardVO();
		board.setBno(3);
		board.setTitle("수정제목");
		board.setContent("수정내용");
		dao.update(board);
	}
	
	@Test
	public void testDelete() throws Exception{
		dao.delete(7);
		
	}
	
 @Test
 public void testListAll() throws Exception{
	 
	 logger.info(dao.listAll().toString());
 }
	
	
	
	
}
