
public class Ex02Test {

	public static void main(String[] args) {
		//final ������ �����ڸ� ���ؼ� �ʱ�ȭ�� �� ���� ������
		Ex02 ex02 = new Ex02(10, 20, "STring"); //final ���� �ʱ�ȭ
		//�ʱ�ȭ�� ���� �������� ���Ѵ�. : final
		//ex02.first = 20; //�� ���� �Ұ���
		Ex02 ex021 = new Ex02(30, 40, "string");
		System.out.println(ex02.first);
		System.out.println(ex021.first); //������ �������� ������ �� ���� �ִ�
		//��ü���� final������ ���� ������ ���� �� �ִ�.
	}

}
