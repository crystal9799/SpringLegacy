package DI_02;

public class HelloApp {

	public static void main(String[] args) {
		
		//�������̽� (������) ������ ���� ....
		//����
		MessageBean en = new MessageBean_eng();
		en.sayHello("Hong");
		//�ѱ�
		MessageBean kr = new MessageBean_kr();
		kr.sayHello("Hong");
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