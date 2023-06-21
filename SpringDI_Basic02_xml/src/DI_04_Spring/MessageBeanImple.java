package DI_04_Spring;

public class MessageBeanImple implements MessageBean{

	private String name;
	private String greeting;
	
	//������ �Լ�
	public MessageBeanImple(String name) {
		this.name = name;
	}
	//setter �Լ�
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	@Override
	public void sayHello() {
		System.out.println(this.name + " / " + this.greeting);
	}

}
