
public interface Ex03 {
	//�������̽�: ���, �߻� �޼��带 ������ �ִ�.
	static final int FIRST = 10; //���
	public void method01(); //�߻� �޼��� //�������̵��� �ؼ� ����ϰڴ�.
	//�����ڰ� ����.
	//�Ϲ� �޼��尡 �ʿ����� �ʴ�. => �Ϲ� �޼��尡 ����. //����ʵ尡 ����.
	//�޼��尡 �ϴ� ������ �ܺηκ��� ����ʵ忡 ���� ���޹ްų�,
	//����ʵ��� ���� �ܺο� �����ϱ� ���ؼ� ���, setter/getter
	default void method02() {
		System.out.println("default-method");
	}
	static void method03() {
		System.out.println("static-method");
	}
}
