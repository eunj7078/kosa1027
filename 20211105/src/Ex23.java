import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		//num = int(input("ù��° ���ڸ� �Է����ּ���."))
		//Scanner
//		Scanner sc = new Scanner(System.in); //�Է�â�� ������ֱ� ���� ��ɾ�
//		System.out.print("�̸��� �Է��ϼ���.: ");
//		String name = sc.next(); //Ŀ�� �����̴°� ������, ���������� ���� ������ ���ᰡ �ȵ�
//		System.out.println("�̸��� " + name);
//		System.out.print("���ڸ� �Է����ּ���.: "); //�̷��� ���� �����־�� ���δ�.
//		int num = sc.nextInt();
//		System.out.println("���� : " + num);
		
		//����: �ܰ� ���� ������ �Է¹޾� �������� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		while (true) { //������ �ѹ��� �����ϱ� ���ؼ� true�� ��� /���̽� ���: ���̽㿡���� do while�� ���� ������ while ~ true�� ���
			System.out.print("�����Ϸ��� ���� �Է��ϼ���.: ");
			int startDan = sc.nextInt();
			System.out.print("������ ���� �Է��ϼ���.: ");
			int endDan = sc.nextInt();
			System.out.print("�����Ϸ��� ���� �Է��ϼ���.: ");
			int startGop = sc.nextInt();
			System.out.print("������ ���� �Է��ϼ���.: ");
			int endGop = sc.nextInt();
			int i;
			int j;
			for (i = startDan;i<=endDan;i++) {
				for(j = startGop;j<=endGop;j++) {
					System.out.println(i + " * "+ j + " = "+ i*j);
				}
				
			}
			System.out.println("�����Ϸ��� 'y', �ƴϸ� �ƹ�Ű��." );
			String stop = sc.next();
			if(stop.equals("y")) {
				System.out.println("���α׷� ����");
				break;
			}
		}
	}

}
