import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stop;
		do{
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
			stop = sc.next();
		}while (!stop.equals("y"));
	}

}
