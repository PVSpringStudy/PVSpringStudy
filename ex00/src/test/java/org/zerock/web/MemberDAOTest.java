package org.zerock.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.MemberVO;
import org.zerock.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOTest {

	@Inject
	private MemberDAO dao;

	@Test
	public void testTime() throws Exception{
		System.out.println("현재 시간 : " + dao.getTime());
	}
	
	@Test
	public void testInsertMember() throws Exception{
		MemberVO vo = new MemberVO();
		
		vo.setUserid("cjf4024");
		vo.setUserpw("z1z1z1");
		vo.setUsername("김종철k");
		vo.setEmail("cjf4028@naver.com");
		
		dao.insertMember(vo);
	}
	
	@Test
	public void testSelect() throws Exception{
		
		MemberVO vo = new MemberVO();
		
		vo = dao.readMember("cjf4028");
		
		System.out.println("id 기준 검색: " + vo);	
		
	}
	
	@Test 
	public void testPW() throws Exception{
		MemberVO vo = new MemberVO();

		vo = dao.readWithPW("whd4028", "z1z1z1");
		System.out.println("id + pw 기준 검색 : "+vo);
	}
	

}
