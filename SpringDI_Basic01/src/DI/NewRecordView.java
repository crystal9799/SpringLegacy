package DI;

//������ ����ϴ� Ŭ����
public class NewRecordView {
	//NewRecordView�� ������ �ޱ� ���ؼ� NewRecord�� �ʿ��մϴ�.
	//��� , ���� **
	
	private NewRecord record;	//member field NewRecord ��ü�� �ּҸ� ���ڴ�.
	//���� (���տ���)
	//������ �ȿ��� ���������ν� �����ֱ⸦ ���ÿ�
	public NewRecordView(int kor, int eng, int math) {
		record = new NewRecord(kor,eng,math);
	}
	
	public void print() {
		System.out.println(record.total() + " / " + record.avg());
	}
	
}
