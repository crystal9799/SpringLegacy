package DI_Annotation_04_javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration	//DI.xml 과 같은 역할을 합니다. (Bean 객체 생성과 조립을 순수한 java파일로..)
public class ConfigContext {
	
	//xml <bean id="user" class="DI_Annotation_04_javaconfig.User"/>
	//자바코드에서는 함수를 통해 객체를 생성하고 return 하게 만든다
	@Bean
	public User user() {
		return new User();
	}
	
	//xml <bean id="user" class="DI_Annotation_04_javaconfig.User"/>
	@Bean
	public User2 user2() {
		return new User2();
	}
}
