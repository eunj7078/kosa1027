
public class Ex02test {

	public static void main(String[] args) {
		int i = 10;
		// cal = calulator()
		// cal1 = calulator()
		Ex02 ex02 = new Ex02(); //Ŭ������ ù���ڴ� ������ �빮�� => ������ �򰥸��� �ʰ� �ϱ� ����
//		�ڷ��� ������
		
		ex02.addr = "�д�";
		ex02.age = 35;
		ex02.name = "�̼���";
		ex02.gender = false;
		System.out.println(ex02.addr);
		System.out.println(ex02.gender);
		
		Ex02 ex021 = new Ex02();
		ex021.addr = "�д�";
		ex021.age = 18;
		ex021.name = "�̻��";
		System.out.println(ex02.name);
		
	}

}
