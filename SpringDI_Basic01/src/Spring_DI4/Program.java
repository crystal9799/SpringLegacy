package Spring_DI4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		/*
			//NewRecordView view = new NewRecordView(100, 50, 40);
			//view.print();
			NewRecordView view = new NewRecordView();
			//놀다가
			//나는 NewRecord 객체의 주소가 필요해
			NewRecord record = new NewRecord(100,100,100);
			view.setRecord(record);	//의존객체의 주소를 주입받는다
			//의존객체(DI) : 필요한 객체의 주소를 setter 함수로 인해 주입받는 작업 > Spring은 자동화...
			view.print();
		*/
		
		/*
		 스프링은 자신만의 메모리 공간을 갖는다.
		 1. SpringFrameWork 컨테이너를 제공한다. (메모리 생성 : 컨테이너 (IOC 컨테이너))
			ApplicationContext context = new ClassPathXmlApplicationContext("DIConfig.xml");
		 	ApplicationContext 메모리 공간을 만들고 DIConfig.xml 컴파일 하고 read 하고 설정한다.
		 
		 2. 컨테이너 만들고 그 메모리에 필요한 객체를 생성하고 조립(주입:DI) .... 나중에 자동 소멸
		 	>> 컨테이너 생성되고 DIConfig.xml read ... 
		 	>> DIConfig.xml 안에 객체 생성과 조립하는 xml 코드가 있다.
		 	>> 생성된 객체를 bean 이라고 부른다.
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("DIConfig.xml");
		//Spring 이 필요한 메모리 공간을 생성하고 생성된 메모리에 DIConfig.xml을 read해서 객체를 생성하고 주입
		
		//컨테이너 안에서 필요한 객체가 있다면 꺼내서 쓰면 된다.
		RecordView view = (RecordView)context.getBean("view");	//getBean returhn Object
		view.input();
		view.print();
	}

}
