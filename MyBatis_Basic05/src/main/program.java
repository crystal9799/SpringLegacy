package main;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.or.bit.dto.User;
import kr.or.bit.service.SqlMapClient;

public class program {
	public static void main(String[] args) {
		//method scope
	    SqlSessionFactory sqlsession=SqlMapClient.getSqlSession();
	    
	    SqlSession session= sqlsession.openSession(); //연결 객체 생성
	    
	    //session.selectOne("Emp.getone", arg1)
	    
	    //<mapper namespace="Emp"> 라는 맵퍼 안의 
	    //<select id="getone" parameterType="String" resultType="kr.or.bit.dto.User">
	    //를 불러오는 것이라 Emp.getone
	    User user = (User)session.selectOne("Emp.getone", "ALLEN");
	    System.out.println(user.getEmpno());
	    System.out.println(user.getEname());
	    session.close();
	    
	}

}



