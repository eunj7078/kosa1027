
public class Ex05Test {

	public static void main(String[] args) {
		Ex05 ex05 = new Ex05();
		/*
		 * ���� ����� ������ ���� ����.
		 * ex05.age = 20; //����� ����
		 * ex05.height = 170.5;
		 */
		ex05.setAge(30);
		ex05.setHeight(160.7);
		/*
		 * System.out.println(ex05.age);
		 */
		ex05.name = "�����"; //�ܺο��� ���� ����
		System.out.println(ex05.getAge());
		System.out.println(ex05.name);

	}

}
