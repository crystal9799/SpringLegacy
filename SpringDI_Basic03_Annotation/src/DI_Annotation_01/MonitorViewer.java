package DI_Annotation_01;

import org.springframework.beans.factory.annotation.Autowired;

public class MonitorViewer {
	private Recorder recorder;

	
	public Recorder getRecorder() {
		return recorder;
	}
	//MonitorViewer�� Recorder�� �����մϴ� ... �ʿ��մϴ� ... �ּҰ� �ʿ�
	/*
	 	<property name="recorder">
			<ref bean="recorder"/>
		</property>
	Annotation ����
	@Autowired (by type)
	�����̳� �ȿ� ��ü���� �����ǰ� ... ���� ... @Autowired ������ ...
	�����̳� �ȿ� Record Ÿ�� �� ��ü�� ã�� ������ �ڵ� ���� ...
	

	
	@Autowired(required = true) >> default >> ������ injection
	@Autowired(required = false) >> �����̳� �ȿ� ���ϴ� Ÿ���� ��ü�� ������ ���� ���ϸ� ���� ...
	*/
	
	@Autowired
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
	}
	
	
}
