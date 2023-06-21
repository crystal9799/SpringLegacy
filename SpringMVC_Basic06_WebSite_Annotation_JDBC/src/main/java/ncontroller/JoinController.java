package ncontroller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.MemberDao;
import vo.Member;

@Controller
@RequestMapping("/joinus/")
public class JoinController {
	
	// memberdao 에 의존
	private MemberDao memberdao;
	
	public void setMemberdao(MemberDao memberdao) {
		this.memberdao = memberdao;
	}
	
	//GET 요청
	//join.jsp 화면
	@GetMapping("join.htm")	//	/joinus/join.htm
	public String join() {
		return "join.jsp";
	}
	
	//POST 요청
	@PostMapping("join.htm")
	public String join(Member member) {
		System.out.println(member.toString());
		try {
			memberdao.insert(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/index.htm";
		
		//http://loaclhost:8090/SpringMvc/joinus/index.htm
		
		// "redirect:/index.htm";
		//http://localhost:8090/SpringMvc/index.htm
	}
	
}




