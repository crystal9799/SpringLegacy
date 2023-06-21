package DI_03_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		
		//�������̽� (������) ������ ���� ....
		//����
		//MessageBean en = new MessageBean_eng();
		//en.sayHello("Hong");
		//�ѱ�
		//MessageBean kr = new MessageBean_kr();
		//kr.sayHello("Hong");
		
		//spring�� ���ؼ� �����̳�(�޸�)�� ����� (�޸�) �ȿ� ��ü ���� , ����
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_03_Spring/DI_03.xml");
		MessageBean messagebean = context.getBean("messagebean",MessageBean.class);
		messagebean.sayHello("hong");
		
	}

}
/*
�䱸����
1. �ѱ۹��� (hong) >> �ȳ� hong
2. �������� (hong) >> Hello hong

MessageBean_kr
MessageBean_eng

interface ������ ����
*/