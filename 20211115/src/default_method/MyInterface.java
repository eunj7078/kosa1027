package default_method;

//�������ص� �ǰ� ���ص� �Ǵ� �������̽�
public interface MyInterface {
	public void method1();
	
	//�������̵带 �� ���� �ְ� ���� ���� �ִ� �޼���
	public default void method2() {
		System.out.println("MyInterface-method2 ����");
	}
}
