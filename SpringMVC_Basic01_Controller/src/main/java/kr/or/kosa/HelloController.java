package kr.or.kosa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.DispatcherServlet;

import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class HelloController implements Controller{	//java 를 웹 전용 파일로 .. Spring

	//doGet , doPost 처럼 생각
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("HelloController 요청 실행 : handleRequest 자동 실행 ^^");
		
		//업무수행
		//DB연결 ... 로직 ... 
		//데이터 담기 , 뷰 지정하기
		ModelAndView mnv = new ModelAndView();
		mnv.addObject("name", "kosauser");		//request.setAttribute() 라고 생각하자
		mnv.setViewName("Hello"); 				//forward >> path > Hello.jsp
												//이전엔 WEB-INF/views/Hello.jsp 로 했었음
		//	/WEB-INF/views/ + Hello + .jsp
		//	/WEB-INF/views/Hello.jsp
		
		return mnv;
	}
	
}
