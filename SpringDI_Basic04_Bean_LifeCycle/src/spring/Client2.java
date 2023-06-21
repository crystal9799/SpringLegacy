package spring;


public class Client2 {
    
	public Client2() {
		System.out.println("Client2 Default");
	}
	
	private String defaulthost;
	public Client2(String defaulthost){
		this.defaulthost = defaulthost;
		System.out.println("Client2 Overloading :" + this.defaulthost);
	}
	
	private String host;
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
		System.out.println("Client2 setHost() ȣ�� : " + this.host);
	}

	public void send(){
		System.out.println("������ ������....");
	}
	
	//�����ڰ� ���Ƿ� ���� �Լ� > ��ü�� �ʱ�ȭ
	public void Client2_init(){
		System.out.println("����� ���� �ʱ�ȭ �Լ� ȣ��");
	}
	//�����ڰ� ���Ƿ� ���� �Լ� > ��ü�� �Ҹ���
	public void Client2_close(){
		System.out.println("����� ���� �Ҹ��� �Լ� ȣ��");
	}

}
