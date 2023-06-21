package Spring_DI4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		/*
			//NewRecordView view = new NewRecordView(100, 50, 40);
			//view.print();
			NewRecordView view = new NewRecordView();
			//��ٰ�
			//���� NewRecord ��ü�� �ּҰ� �ʿ���
			NewRecord record = new NewRecord(100,100,100);
			view.setRecord(record);	//������ü�� �ּҸ� ���Թ޴´�
			//������ü(DI) : �ʿ��� ��ü�� �ּҸ� setter �Լ��� ���� ���Թ޴� �۾� > Spring�� �ڵ�ȭ...
			view.print();
		*/
		
		/*
		 �������� �ڽŸ��� �޸� ������ ���´�.
		 1. SpringFrameWork �����̳ʸ� �����Ѵ�. (�޸� ���� : �����̳� (IOC �����̳�))
			ApplicationContext context = new ClassPathXmlApplicationContext("DIConfig.xml");
		 	ApplicationContext �޸� ������ ����� DIConfig.xml ������ �ϰ� read �ϰ� �����Ѵ�.
		 
		 2. �����̳� ����� �� �޸𸮿� �ʿ��� ��ü�� �����ϰ� ����(����:DI) .... ���߿� �ڵ� �Ҹ�
		 	>> �����̳� �����ǰ� DIConfig.xml read ... 
		 	>> DIConfig.xml �ȿ� ��ü ������ �����ϴ� xml �ڵ尡 �ִ�.
		 	>> ������ ��ü�� bean �̶�� �θ���.
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("DIConfig.xml");
		//Spring �� �ʿ��� �޸� ������ �����ϰ� ������ �޸𸮿� DIConfig.xml�� read�ؼ� ��ü�� �����ϰ� ����
		
		//�����̳� �ȿ��� �ʿ��� ��ü�� �ִٸ� ������ ���� �ȴ�.
		RecordView view = (RecordView)context.getBean("view");	//getBean returhn Object
		view.input();
		view.print();
	}

}
