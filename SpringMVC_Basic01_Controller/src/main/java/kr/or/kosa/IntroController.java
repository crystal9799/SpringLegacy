package kr.or.kosa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IntroController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		System.out.println("인트로 자동 실행");
		
		ModelAndView mnv = new ModelAndView();
		mnv.addObject("intro", "인트로");
		mnv.setViewName("Intro");
		
		return mnv;
	}

}
