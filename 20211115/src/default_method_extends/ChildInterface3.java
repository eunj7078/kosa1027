package default_method_extends;

public interface ChildInterface3 extends ParentInterface{
	public void method3();
	@Override //��ӹ��� default �޼��� ������
	public void method2(); //default �޼��带 �߻�޼���� �������̵� ��
	//��ӹ��� default �޼��带 �� �������ϵ��� ��
}
