package AOP_Basic_02_java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

//��������(�������) �����ϴ� Ŭ����
//������������ ���� �Լ��� �븮�� �� �־�� �Ѵ�. (�븮�Լ�) : invoke
//invoke �Լ��� �������� ���� �Լ��� �븮�� �� �ִ�.

public class LogPrintHandler implements InvocationHandler{

	//�� ��ü�� �ּҰ�
	private Object target;
	public LogPrintHandler(Object target) {
		System.out.println("LogPrintHandler ������ ȣ�� : " + target);
		this.target=target;
		
	}
	
	//invoke �Լ��� (ADD , MUL , SUB) �Լ��� �븮�մϴ�.
	//��ġ ��¥ó��
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("invoke �Լ� ȣ��");
		System.out.println("Method method : " + method);
		System.out.println("Method parameter : " + Arrays.toString(args)); 
		
		//��������
		//�ð�ó�� ����(���۽ð�)
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("[Ÿ�̸� ����]");
		
		//�־��� (���� �Լ��� ȣ��) : �ְ�ü�� ������ ���Լ� ȣ��(ADD , MUL , SUB)
		int result = (int)method.invoke(this.target, args);
		
		
		//��������
		//�ð�ó�� ����(���ð�)
		sw.stop();
		log.info("[Ÿ�̸� ����]");
		log.info("[Time log Method : ]" + method);
		log.info("[Time log Method : " + sw.getTotalTimeMillis()+"]");
		
		return result;
	}
	
}
