package dao;

import java.sql.SQLException;
import vo.Member;

public interface MemberDao {
	Member getMember(String userid) throws ClassNotFoundException, SQLException;
    int insert(Member member) throws ClassNotFoundException, SQLException; 
	
    //회원수정
  	int updateMember(Member member);  //암호화
}
