
public class Ex061 {
	String name;
	int age;
	double height;
	//�ڹٿ��� �����ڴ� Ŭ������� ���ƾ� �Ѵ�.
	//������(���̽��� Ŭ�������� �����ڴ� 1��)
//	���������� Ŭ���� (�Ű�����, ...)
	public Ex061(String name, int age, double height) { //void�� ����� ��
		this.name = name;
		this.age = age;
		this.height = height;
		System.out.println("������ ����");
	}
	//�޼��� : Ŭ���� �ȿ� �ִ� �Լ�(���̽�� ����)
//	���������� ��ȯ�� �Լ��� (�Ű�����)
	//setter
		//��ȯ��(void: ��ȯ�� �� ����)
	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	//getter
	public int getAge() {
		//������ ��ȯ
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getheight() {
		return this.height;
	}
}
