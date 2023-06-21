package AOP_Basic_02_java;

import java.lang.reflect.Proxy;

public class Program {

	public static void main(String[] args) {
		
		//1. �ǰ�ü�� �ּ�
		Calc calc = new NewCalc();
		
		//2. ���Ӽ� (��¥ �Լ��� ȣ���ϴ� ���� �ƴϰ� ��¥�� ���� ȣ�� : ���� ������ �����ϱ� ���ؼ�)
		// ��¥ (Proxy)
		Calc cal = (Calc)Proxy.newProxyInstance(calc.getClass().getClassLoader(), 	//�ǰ�ü�� ���� ����(���� ����) : ��Ÿ����
							   calc.getClass().getInterfaces(),		//���� ���� (�������̽�)
							   new LogPrintHandler(calc));			//�������� ���� (�������) ��ü ����
		//���� ����� (��¥ ����ϴ� ��ó�� ���)
		int result = cal.ADD(555, 666);
		System.out.println("result : " + result);
	}

}
