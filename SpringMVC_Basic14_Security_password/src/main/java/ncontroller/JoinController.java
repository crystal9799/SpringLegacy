package ncontroller;

import java.security.Principal;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.MemberDao;
import service.MemberService;
import vo.Member;

@Controller
@RequestMapping("/joinus/")
public class JoinController {

	// memberdao 의존
	private MemberService memberservice;
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	public void setBCryptPasswordEncoder(BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.bCryptPasswordEncoder=bCryptPasswordEncoder;
	}
	
	@Autowired
	public void setMemberService(MemberService memberservice) {
		this.memberservice = memberservice;
	}
	
	//GET 요청
	//join.jsp 화면
	@GetMapping("join.htm")  //  /joinus/join.htm
	public String join() {
		return "joinus/join";
	}
	
	//POST 요청
	@PostMapping("join.htm")
	public String join(Member member) {
		member.setPwd(this.bCryptPasswordEncoder.encode(member.getPwd())); //암호화 
		return memberservice.join(member);
	}
	
	//로그인 요청
	@GetMapping(value="login.htm")
	public String login() {
		return "joinus/login";
	}
	
	@GetMapping(value="memberconfirm.htm")
	public String mypage() {
		return "joinus/memberConfirm";
	}
	
	@PostMapping(value="memberconfirm.htm")
	public String mypage(@RequestParam("password") String rawPassword,	Principal principal) throws ClassNotFoundException, SQLException {
		String viewpage="";
		
		//회원정보
		Member member = memberservice.getMember(principal.getName());
		
		
		//DB에서 가져온 암호화된 문자열
		String encodedPassword = member.getPwd();
		
		System.out.println("rowPassword : "+rawPassword );
		System.out.println("encodepassword : " + encodedPassword);
		
		boolean result = bCryptPasswordEncoder.matches(rawPassword, encodedPassword);
		
		if(result){
			viewpage="redirect:memberUpdate.htm";
		}else{
			viewpage="redirect:memberconfirm.htm";
		}
		
		return viewpage;
	}
	
	@GetMapping(value="memberUpdate.htm")
	public String update(Model model, Principal principal) throws ClassNotFoundException, SQLException {
		Member member = memberservice.getMember(principal.getName());
		model.addAttribute(member);
		return "joinus/memberUpdate";
	}
	
	@PostMapping("memberUpdate.htm")
	public String update(Model model, Member member, Principal principal) throws ClassNotFoundException, SQLException {
		
		Member updatemember = memberservice.getMember(principal.getName());
		
		updatemember.setName(member.getName());
		updatemember.setEmail(member.getEmail());
		updatemember.setPwd(member.getPwd());
		
		//암호화작업
		updatemember.setPwd(bCryptPasswordEncoder.encode(member.getPwd()));
		memberservice.updateMember(updatemember);
		return "redirect:/index.htm";
	}

}
