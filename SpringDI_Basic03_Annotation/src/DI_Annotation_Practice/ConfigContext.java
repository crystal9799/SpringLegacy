package DI_Annotation_Practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigContext {
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	@Bean
	public MemberRegisterService memberRegisterService(MemberDao memberDao) {
		return new MemberRegisterService(memberDao());
	}
	
}
