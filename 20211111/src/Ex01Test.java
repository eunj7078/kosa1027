
public class Ex01Test {

	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		Ex01 ex02 = new Ex01();
		Ex01 ex03 = new Ex01();

		if(ex01 == ex02) { //2���� ���� ���� ��ü�İ� ���
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		ex01.first = 20;
		System.out.println(ex02.first);
		System.out.println(ex01.first);
		//���� �ٸ� ���� ���� �ִ� = ���� �ٸ� ��ü�̴�
		
		Singleton s1 = Singleton.getInstance();//30000
		Singleton s2 = Singleton.getInstance();//30000
		
		if(s1 == s2) { //2���� ���� ���� ��ü�İ� ���
			System.out.println("s1�� s2�� ����");
		}else {
			System.out.println("s1�� s2�� �ٸ���");
		}
	}

}
