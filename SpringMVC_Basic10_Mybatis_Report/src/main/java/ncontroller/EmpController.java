package ncontroller;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import service.EmpService;
import vo.Emp;

@Controller
@RequestMapping("/Emp/")
public class EmpController {
	
	private EmpService empservice;
	
	@Autowired
	public void setEmpService(EmpService empservice) {
		this.empservice = empservice;
	}
	
	//전체조회
	@RequestMapping("EmpList.htm")
	public String getEmpList(Model model){
		List<Emp> list = empservice.getEmpList();
		System.out.println(list.toString());
		model.addAttribute("list",list);
		System.out.println("실행됐나?");
		return "Emp/emp";
	}
	
	//조건조회
	@RequestMapping("getEmp.htm")
	public String getEmp(@RequestParam("search") String search, Model model) {
		List<Emp> list = empservice.getEmp(search);
		model.addAttribute("list", list);
		return "Emp/emp";
	}
	
	//수정
	@GetMapping("editEmp.htm")
	public String editEmp(@RequestParam("empno") int empno, Model model) {
		System.out.println("여기까지 왔음");
		Emp emp = null;
		emp = empservice.empDetail(empno);
		System.out.println(empno);
		model.addAttribute(emp);
		return "Emp/empEdit";
	}
	
	//수정완료
	@PostMapping("editEmp.htm")
	public String editEmp(Emp emp) {
		System.out.println("수정완료");
		empservice.updateEmp(emp);
		return "redirect:EmpList.htm";
	}
	
	//삭제
	@GetMapping("deleteEmp.htm")
	public String deleteEmp(int empno, Model model) {
		empservice.deleteEmp(empno);
		return "redirect:EmpList.htm";
	}
	
	//삽입
	@GetMapping("insertEmp.htm")
	public String insertEmp() {
		
		return "Emp/empInsert";
	}
	
	//삽입(완료)
	@PostMapping("insertEmp.htm")
	public String insertEmp(Emp emp) {
		System.out.println("삽입완료");
		empservice.insertEmp(emp);
		return "redirect:EmpList.htm";
	}
}
