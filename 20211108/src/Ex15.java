
public class Ex15 {

	public static void main(String[] args) {
		WEEK1 today = WEEK1.�����;
		System.out.println(today); 		//������ ���
		String name = today.name(); 	//������ ����� ���ٿ��� ����ȯ
		System.out.println(name);  		//���ڿ�
		
		//������ ����� ������ �ִ� �������� ������ ����
		
		int ordinal = today.ordinal(); //������ ����� ���� �ִ� ���
		System.out.println(ordinal);
		
		WEEK1 day1 = WEEK1.�����;
		WEEK1 day2 = WEEK1.ȭ����;
		
		int result = day1.compareTo(day2);
		System.out.println(result); //������� ȭ���Ϸκ��� 2�� �������ϴ�.
		result = day2.compareTo(day1);
		System.out.println(result); //ȭ������ 2�� ���Դϴ�.
		
		//���ڿ��� ���������� ��ȯ
		
		String day ="������";
		WEEK1 weekDay = WEEK1.valueOf(day);
		System.out.println(weekDay); //������ ���
		//�������� �ִ� ��� ����� ��������
		
		WEEK1 day3 = WEEK1.�ݿ���;
		//������ �������� ������ ��� �ϳ��� ����ȴ�.
		WEEK1 [] days = WEEK1.values(); //������ ����� �迭�� ��ȯ
		for(WEEK1 w: days) {
			System.out.println(w);
		}
	}

}
