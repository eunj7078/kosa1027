package promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		Parent parent = new Parent();
		parent = child; //�θ� �ڽ��� ������ ��� �ڽĿ��� ���ǵ� ���� ����� �� ����.
		parent.method1();
		parent.method2(); //�ڽĿ��� �������̵��� �޼���� ��밡���ϴ�.=>�������̵��� �޼ҵ尡 ����
		//parent.method3(); //�ڽĿ��� ���ǵ�
	}

}
