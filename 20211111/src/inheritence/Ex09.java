package inheritence;

public class Ex09 extends Ex08{
	//public Ex09() {} //�⺻������ ��� �Ұ���
	int val;
	//�θ� Ŭ������ �����ڰ� ���� ��� �ڽ� Ŭ���������� �θ� Ŭ������ ���� �����ϱ� ���� �����ڰ� �ݵ�� �־�� ��
	public Ex09(int first, int second, int val) { //�θ� Ŭ������ ���� �����ϱ� ���� ������ �ʿ���
		super(first, second);
		this.val = val;
	}
	public void sub() {
		result = first - second;
	}
	public void mul() {
		result = first * second;
	}
	@Override
	public void div() { // �θ� ���� �޼��带 �ڽĿ��� ������ �Ѵ�.
		if(second == 0) {
			result = 0;
		}else {
			result = first / second;
		}
	}
	//�θ� ���� div�� �״�� ��� ����
	public void div1() { //�����ǵ� �θ� Ŭ������ �ִ� �޼��带 ȣ���Ѵ�.
		super.div();
	}
}
