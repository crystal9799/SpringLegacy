package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.EmpDao;
import vo.Emp;

@Service
public class EmpService {
	
	private SqlSession sqlsession;
	
	@Autowired
	public void setSqlsession(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	//전체조회
	public List<Emp> getEmpList(){
		List<Emp> list =null;
		
		try {
			EmpDao empdao = sqlsession.getMapper(EmpDao.class);
			
			list = empdao.getEmpList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	//부분조회
	public List<Emp> getEmp(String search){
		List<Emp> list = null;
		
		try {
			EmpDao empdao = sqlsession.getMapper(EmpDao.class);
			System.out.println(search);
			list = empdao.getEmp(search);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	//디테일(조회)
	public Emp empDetail(int empno) {
		Emp emp = null;
		
		try {
			EmpDao empdao = sqlsession.getMapper(EmpDao.class);
			System.out.println(empno);
			emp = empdao.empDetail(empno);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}
	
	//수정
	public void updateEmp(Emp emp) {
		try {
			EmpDao empdao = sqlsession.getMapper(EmpDao.class);
			System.out.println(emp.toString());
			int resultrow = empdao.updateEmp(emp);
			System.out.println(resultrow);
			System.out.println("Edit 이동하는 곳");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//삭제
	public void deleteEmp(int empno) {
		try {
			EmpDao empdao = sqlsession.getMapper(EmpDao.class);
			System.out.println(empno+"삭제중...");
			int resultrow = empdao.deleteEmp(empno);
			System.out.println(resultrow);
			System.out.println("Delete 이동하는 곳");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//삽입
	public void insertEmp(Emp emp) {
		try {
			EmpDao empdao = sqlsession.getMapper(EmpDao.class);
			System.out.println(emp.toString()+"완료 ㅋ");
			int resultrow = empdao.insertEmp(emp);
			System.out.println(resultrow);
			System.out.println("Insert 이동하는 곳");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
