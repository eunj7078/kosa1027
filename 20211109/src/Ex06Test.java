
public class Ex06Test {

	public static void main(String[] args) {
		Ex06 ex06; //���� ����
		ex06 = new Ex06(); //��ü ����
		//��� �ʵ��� �ʱ�ȭ
		ex06.setData("�̽¹�", 30, 175.2);
		String name = ex06.getName();
		System.out.println(name);

		//��ü ������ ���ÿ� ��� �ʵ忡 �ʱ�ȭ : ������
		Ex061 ex061 = new Ex061("�̻��", 18, 175.5);
		// ��ü ���� �ÿ� �����ڰ� �ڵ����� ����
		// ����ʵ带 �ʱ�ȭ�� �� ��� = ������
		System.out.println(ex061.getAge());
	}

}
