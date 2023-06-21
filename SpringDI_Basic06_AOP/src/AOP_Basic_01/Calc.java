package AOP_Basic_01;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

/*
������ ��Ģ ����� ���α׷�
-�־��� (�ְ���) : ��Ģ���� (ADD , MUL) >> �ֿ� ���
-�䱸���� (���꿡 �ɸ� �ð�) : �������(�������)
-log ���

�ð��� ������ �������� �ð� ...
100���� �Լ� �ð��� üũ ������ ... ��¥�� ... 100���� �Լ�
*/
public class Calc {
	
	public int Add(int x, int y) {
		
		//�ð�ó�� ����(���� �ð�)
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("[Ÿ�̸� ����]");
		
		//�־���
		int result = x+y;
		
		//�ð�ó�� ����(������ �ð�)
		sw.stop();
		log.info("[Ÿ�̸� ����]");
		log.info("[Time log Method : ADD]");
		log.info("[Time log Method : ]" + sw.getTotalTimeMillis());
		return result;
	}
	
	public int Mul(int x , int y) {
		//�ð�ó�� ����(���� �ð�)
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("[Ÿ�̸� ����]");
		//�־���
		int result = x * y;
		
		//�ð�ó�� ����(������ �ð�)
		sw.stop();
		log.info("[Ÿ�̸� ����]");
		log.info("[Time log Method : MUL]");
		log.info("[Time log Method : ]" + sw.getTotalTimeMillis());
		return result;
	}
	
}
