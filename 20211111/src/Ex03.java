
public class Ex03 {
	static String name; //���� ���� : ��� ��ü�� ���� �����ؼ� ����ϱ� ���ؼ� 
	//���� ���� �ʱ�ȭ : static ��
	//���
	static final int first;
	static final int second;
	//final ���� : ��ü���� ������ ���� ���� �� �ִ�. �����ڸ� �̿��ؼ� �ʱ�ȭ ��
	final int val1;
	final int val2;
	static {
		name = "�̽¹�";
		first = 10;
		second = 5;
	}
	public Ex03(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Ex03.name = name;
	}
	public static int getFirst() {
		return first;
	}
	public static int getSecond() {
		return second;
	}
	public int getVal1() {
		return val1;
	}
	public int getVal2() {
		return val2;
	}
	
}
