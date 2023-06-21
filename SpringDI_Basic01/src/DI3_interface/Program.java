package DI3_interface;

public class Program {

	public static void main(String[] args) {
		//NewRecordView view = new NewRecordView(100, 50, 40);
		//view.print();
		NewRecordView view = new NewRecordView();
		//놀다가
		//나는 NewRecord 객체의 주소가 필요해
		NewRecord record = new NewRecord(100,100,100);
		view.setRecord(record);	//의존객체의 주소를 주입받는다
		//의존객체(DI) : 필요한 객체의 주소를 setter 함수로 인해 주입받는 작업 > Spring은 자동화...
		view.print();
	}

}
