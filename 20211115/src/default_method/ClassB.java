package default_method;

public class ClassB extends ClassA{
	public void method03() {
		System.out.println("ClassB-method03");
	}

	//�߻� �޼ҵ� �������̵�
	//�Ϲ� �޼ҵ�� ���� �������̵��� �ʿ�� ����
	@Override
	public void method01() { //�߻�޼���
		System.out.println("ClassB-method01");	
	}
	//��ӹ��� �Ϲ� �޼���� �������̵� ���� �ʾƵ� ��
}
