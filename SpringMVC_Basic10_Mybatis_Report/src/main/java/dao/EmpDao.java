package dao;

import java.sql.SQLException;
import java.util.List;
import vo.Emp;

public interface EmpDao {
	List<Emp> getEmpList() throws ClassNotFoundException, SQLException;
	List<Emp> getEmp(String search)throws ClassNotFoundException, SQLException;
	int insertEmp(Emp emp)throws ClassNotFoundException, SQLException;
	int updateEmp(Emp emp)throws ClassNotFoundException, SQLException;
	int deleteEmp(int empno)throws ClassNotFoundException, SQLException;
	Emp empDetail(int empno)throws ClassNotFoundException, SQLException;
}
