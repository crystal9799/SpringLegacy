package spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Client implements InitializingBean , DisposableBean {
    
	public Client() {
		System.out.println("Client Default");
	}
	
	private String defaulthost;
	public Client(String defaulthost){
		this.defaulthost = defaulthost;
		System.out.println("Client Overloading :" + this.defaulthost);
	}
	
	private String host;
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
		System.out.println("Client setHost() ȣ�� : " + this.host);
	}

	public void send(){
		System.out.println("������ ������....");
	}
	
	
	//�ʱ�ȭ
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Client �ʱ�ȭ �Լ� ȣ��");		
	}

	//�Ҹ� (��ü�� �Ҹ�ɶ� ȣ��Ǵ� �Լ�)
	@Override
	public void destroy() throws Exception {
		System.out.println("Client �Ҹ��� �Լ� ȣ��");
		
	}

}
