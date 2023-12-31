package DI_Annotation_01;

import org.springframework.beans.factory.annotation.Autowired;

public class MonitorViewer {
	private Recorder recorder;

	
	public Recorder getRecorder() {
		return recorder;
	}
	//MonitorViewer는 Recorder에 의존합니다 ... 필요합니다 ... 주소가 필요
	/*
	 	<property name="recorder">
			<ref bean="recorder"/>
		</property>
	Annotation 으로
	@Autowired (by type)
	컨테이너 안에 빈객체들이 생성되고 ... 주입 ... @Autowired 만나면 ...
	컨테이너 안에 Record 타입 빈 객체를 찾고 있으면 자동 주입 ...
	

	
	@Autowired(required = true) >> default >> 무조건 injection
	@Autowired(required = false) >> 컨테이너 안에 원하는 타입의 객체가 없으면 주입 안하면 되지 ...
	*/
	
	@Autowired
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
	}
	
	
}
