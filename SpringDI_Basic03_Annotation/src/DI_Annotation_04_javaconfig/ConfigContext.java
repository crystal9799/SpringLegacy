package DI_Annotation_04_javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration	//DI.xml �� ���� ������ �մϴ�. (Bean ��ü ������ ������ ������ java���Ϸ�..)
public class ConfigContext {
	
	//xml <bean id="user" class="DI_Annotation_04_javaconfig.User"/>
	//�ڹ��ڵ忡���� �Լ��� ���� ��ü�� �����ϰ� return �ϰ� �����
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
