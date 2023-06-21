package DI_06_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		
		//java �ڵ�
		//Articleservice service = new Articleservice(new OracleDao());
		//Articleservice service = new Articleservice(new MySqlDao());
		//Article article = new Article();
		//service.write(article);
		
		
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_06_Spring/DI_06.xml");
		Articleservice service = context.getBean("service",Articleservice.class);
		Article article = context.getBean("article",Article.class);
		service.write(article);
		
		/*
		  getBean()
		  1. �����̳� �ȿ� �ִ� ��ü�� ����  (new �� �ƴϿ���)
		  2. return type Object (Ÿ�Կ� �´� casting)
		  3. **������ �����̳� �ȿ� ��ü���� default singleton
		  4. **���������� getbean() �� new ��� �� �� �� �ִ� (���� ���� �ʴ´�)
		    
		  �츮�� ����ϴ� getBean�Լ��� ��ü�� ����� �Լ��� �ƴϰ�,
		  ������� ��ü�� �ּҸ� �������� ����
		  ���ϰ��� Object
		 
		 */
	}

}
