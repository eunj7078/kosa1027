
public class Singleton {
	int first;
	int second;
	//private 
	static int val = 10;
	//�ڱ� �ڽ��� ��ü�� �̸� ����� ���� ���
	//�̱���
	private static Singleton singleton = new Singleton(); //30000
	private Singleton() {}
	public static Singleton getInstance() { //�ڽ��� ��ü�� ����
		//�̱��� ��ü�� ����Ҷ��� getInstance�� ����ϵ��� �����ڳ����� �Ϲ����� ���, �̸��� �ƹ��ų� �ص� ������
		//���� ������ �ȵǱ� ������ ������ �� �ֵ��� �Լ��� �������.
		return singleton;
	}
	///
	
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
}
