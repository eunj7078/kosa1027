import java.util.Scanner;

public class Ho01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sel = null;
		boolean exe = true;
		do {
			System.out.println("1. ���µ�� | 2. ���� ��� | 3. ���� | 4. ��� | 5. ����");
			System.out.print("���� > ");
			sel = sc.nextLine();
			switch(sel) {
			case "1": 
				System.out.println("���µ�� ������ �Դϴ�."); 
				System.out.print("���� ��ȣ�� �Է����ּ���. : ");
				String num = sc.nextLine();
				System.out.print("�����ָ� �Է����ּ���. : ");
				String num2 = sc.nextLine();
				System.out.print("�ݾ��� �Է����ּ���. : ");
				int num3 = sc.nextInt();
				break;
			case "2": 
				System.out.println("���� ��� ������ �Դϴ�."); 
				
				break;
			case "3": 
				System.out.println("���� ������ �Դϴ�.");
				
				break;
			case "4": 
				System.out.println("��� ������ �Դϴ�."); 
				
				break;
			case "5": 
				System.out.println("���α׷��� �����մϴ�."); 
				exe = false;
				break;
			}		
		}while(exe);
		
		
		
		
	}

}
