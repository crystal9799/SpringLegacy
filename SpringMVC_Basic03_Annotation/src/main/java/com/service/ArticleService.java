package com.service;

import org.springframework.stereotype.Service;

import com.model.NewArticleCommand;

/*
@Component
 일반적인 컴포넌트로 등록되기 위한 클래스에 사용
@Controller
 컨트롤러 클래스에 사용
@Service
 서비스 클래스에 사용
@Repository
 DAO 클래스 또는 레포지토리 클래스에 사용
*/


/*
@Service >> 너는 빈객체로 생성되어야 해
public class ArticleService

xml 파일에 (설정) spring-servlet.xml
<context:component-scan base-package="com.service"/>

*/
public class ArticleService {
	public ArticleService() {
		System.out.println("articleservice 생성자 호출");
	}
	
	public void writeArticle(NewArticleCommand command) {
		//DAO 동작한다 가정
		//insert 가정하고
		System.out.println("글쓰기 작업 완료 : " + command.toString());
	}
}
