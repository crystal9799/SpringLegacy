package AOP_Basic_02_java;

public class NewCalc implements Calc{

	@Override
	public int ADD(int x, int y) {
		//��������(�������) : Ⱦ�ܰ���
		
		//�ְ���
		int sum = x + y;		
		//��������(�������) : Ⱦ�ܰ���
		return sum;
	}

	@Override
	public int MUL(int x, int y) {
		//��������(�������) : Ⱦ�ܰ���
		
		//�ְ���
		int mul = x*y;
		//��������(�������) : Ⱦ�ܰ���
		
		return mul;
	}

	@Override
	public int SUB(int x, int y) {
		//��������(�������) : Ⱦ�ܰ���
		
		//�ְ���
		int sub = x - y;
		//��������(�������) : Ⱦ�ܰ���
		
		return sub;
	}
	
}
