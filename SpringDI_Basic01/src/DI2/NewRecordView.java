package DI2;

//������ ����ϴ� Ŭ����
public class NewRecordView {
	//NewRecordView�� ������ �ޱ� ���ؼ� NewRecord�� �ʿ��մϴ�.
	//��� , ���� **
	
	private NewRecord record;	//member field NewRecord ��ü�� �ּҸ� ���ڴ�.
	
	//NewRecord ��ü�� �ּҸ� �ʿ信 ���� ���Թް� �;��.
	//NewRecordView ��������ٰ� �ؼ� ������ record �� NewRecord ���� �ʿ�� �����.
	
	//���� �Լ�
	public void setRecord(NewRecord record) {
		this.record = record;
	}
	/*
		���� �ϰ� �ʿ���
		���� ���� ��ü [�ּ�]�� �ʿ���
		
		1. �����ڸ� ���ؼ� �ʿ��� ��ü�� ���� �Ǵ� ���� > DI > ����, ����
		2. �Լ�(setter)�� ���ؼ� �ʿ��� ��ü�� ���� > DI > ���� > �ʿ信 ����
	*/
	public void print() {
		System.out.println(record.total() + " / " + record.avg());
	}

	
}
