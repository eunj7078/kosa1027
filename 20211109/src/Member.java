
public class Member {
	int age;
	double height;
	String name;
	
	public Member() {} //����Ʈ ������
	
	public Member(int age) { //���̸� ����Ǵ� ������ //�޼��� �����ε� //�Ű������� ������ Ÿ���� ���� �ٸ� �� �Ű������� �����ε��̶�� ��
		this.age = age;
	}
	
	public Member(String name) { //�̸��� �ʱ�ȭ
		this.name = name;
	}
	
	public Member(int age, double height, String Name) { //��� �� �ʱ�ȭ
		this.age = age;
		this.height = height;
		this.name = name;
	}
	
	public Member(double height, int age, String Name) { //��� �� �ʱ�ȭ
		this.age = age;
		this.height = height;
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
}
