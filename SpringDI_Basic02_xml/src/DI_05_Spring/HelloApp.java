package DI_05_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
	
		/*
		  MyBean mybean = new MyBean(); MyBean mybean2 = new MyBean("hong"); MyBean
		  mybean3 = new MyBean();
		  
		  System.out.println(mybean + " , " + mybean2 + " , " + mybean3);
		  
		  Singleton single = Singleton.getInstance(); Singleton single2 =
		  Singleton.getInstance(); Singleton single3 = Singleton.getInstance();
		  
		  System.out.println(single + " , " + single2 + " , " + single3);
		 */
	
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_05_Spring/DI_05.xml");
		MyBean m =  context.getBean("mybean",MyBean.class);
		MyBean m2 =  context.getBean("mybean",MyBean.class);
		MyBean m3 =  context.getBean("mybean",MyBean.class);
		System.out.println(m);
		System.out.println(m2);
		System.out.println(m3);
		//DI_05_Spring.MyBean@589838eb
		//DI_05_Spring.MyBean@589838eb
		//DI_05_Spring.MyBean@589838eb
		
		Singleton single =  context.getBean("single",Singleton.class);
		Singleton single2 =  context.getBean("single",Singleton.class);
		
		System.out.println(single  + " , " + single2);
		
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