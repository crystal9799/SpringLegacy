package service;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MemberDao;
import vo.Member;

@Service
public class MemberService {
	
	private SqlSession sqlsession;
	
	@Autowired
	public void setMemberdao(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	//회원가입 하기
	public String join(Member member) {
		////////////////////////////////////////////////////////////
		MemberDao memberdao = sqlsession.getMapper(MemberDao.class);
		////////////////////////////////////////////////////////////
		try {
			memberdao.insert(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:/index.htm";
	}
	
	public Member getMember(String userid) throws ClassNotFoundException, SQLException{
		MemberDao dao = sqlsession.getMapper(MemberDao.class);
		Member member = dao.getMember(userid);
		return member;
	}
	
	public void updateMember(Member member){
		MemberDao dao = sqlsession.getMapper(MemberDao.class);
		int result = dao.updateMember(member);
		if(result > 0){
			System.out.println("업데이트 성공");
		}else{
			System.out.println("업데이트 실패");
		}
	}
}
