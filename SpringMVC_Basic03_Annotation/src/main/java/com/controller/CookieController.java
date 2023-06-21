package com.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {
	
	
	@RequestMapping("/cookie/make.do")	//cookie/make.do url 패턴이 들어오면 함수 실행
	//이렇게(파라미터로)만 넣어줘도 생성된 객체를 자동으로 받는다
	public String make(HttpServletResponse response) {
		
		response.addCookie(new Cookie("auth", "1004")); //servlet과 동일
		
		return "cookie/CookieMake";
	}
	
	
	//public String view(HttpServletRequest request) {	//전통적인 방법
	
	@RequestMapping("/cookie/view.do")
	//들어온 쿠키가 auth 라면 그 값을 auth 변수에 담고 빈 쿠키가 온다면 값에 1007을 넣어준다.
	public String view(@CookieValue(value="auth", defaultValue = "1007")String auth) {
		System.out.println("클라이언에서 read한 쿠키값 : " + auth);
		return "cookie/CookieView";
	}
}
