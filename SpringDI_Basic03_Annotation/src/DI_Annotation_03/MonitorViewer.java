package DI_Annotation_03;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/*

JAVA 1.9 �������� @Resource ����ϱ� ���ؼ�
javax.annotation-api-1.3.2.jar ���� �߰��ؾ� �մϴ�.

maven
<dependency>
	<groupId>javax.annotation</groupId>
	<artifactId>javax.annotation-api</artifactId>
	<version>1.3.1</version>
</dependency>
*/

public class MonitorViewer {
	private Recorder recorder;
	
	public Recorder getRecorder() {
		return this.recorder;
	}
	
	//@Autowired  by type
	@Resource(name="yy") //���� Ÿ���� ��ü�� ������ name ������ �O�´�
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("setRecorder : " + this.recorder);
	}
	
	
}
