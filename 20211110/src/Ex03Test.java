
public class Ex03Test {

	public static void main(String[] args) { 
		Ex03 ex031 = new Ex03();
		ex031.first = 10;
		ex031.second = 20;
		ex031.val = 30;
		Ex03 ex032 = new Ex03();
		System.out.println(ex032.first); //0
		System.out.println(ex032.second); //0
		System.out.println(ex032.val); //30
		System.out.println(Ex03.val); //30
		int result = ex031.add();
		System.out.println(result); //30+10
		result = ex032.add();
		System.out.println(result);
		
		result = Ex03.sub(); // static���� instance���� ����� �� ���� ������ Ŭ���� ���� �ٿ���
		// �޼����� static Ű���忡�� Ŭ���� ���� �̿��ؼ� ����ϱ� ���� �޼ҵ��̴�.
		// �޼��� ������ this Ű���带 ����� �� ����.
		System.out.println(result);

	}

}
