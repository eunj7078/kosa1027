import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Account acc = new Account("1111", "�̽¹�", 100); 
		 * Account acc1 = new Account("2222", "�̻��", 100); 
		 * Account acc2 = new Account("3333", "�����", 100);
		 */
		int arrayNum = 0; // �迭�� ���� ��ȣ ������ ���� ����
		Account [] accs = new Account[100]; //100���� ���¸� �����ڰ� �迭�� ����
		//�迭�� index�� 0������ ����
		boolean run = true; //���ѷ����� ������ ���� �ο� ����
		//while(run) {
		do {
			System.out.println("1. ���µ�� | 2. ���� ��� | 3. ���� | 4. ��� | 5. ����"); //������
			System.out.print("���� > "); //���ڷ� �Է¹���
			String selecNo = sc.nextLine(); //���ڷ� ���� => int selecNo = sc.nextInt();
			//int selecNo = sc.nextInt(); sc.nextLine;// �Է���ġ�� \n���� �ִ� ���� ���ֱ� ���� ���
			                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
			switch(selecNo) { //������ �����߳Ŀ� ���� ������ �� �� �޶���
			case "1": //1���� �����ϸ� = ���� ����� �����ϸ�
				System.out.println("���µ�� �������Դϴ�."); //���µ�� ��������� �޽��� ���
				System.out.print("���� ��ȣ : "); //���¹�ȣ�� �Է��϶�� �޽��� ���
				String accountNo = sc.nextLine();  //����ڿ��Լ� ���¹�ȣ�� �Է¹���
				System.out.print("���� �� : "); //�����ָ� �Է��϶�� �޽��� ���
				String owner = sc.nextLine(); //�����ָ� �Է¹���
				System.out.print("�ݾ� : "); //�ݾ��� �Է��϶�� �޽��� ���
				int money = sc.nextInt(); //�ݾ��� �Է¹���
				accs[arrayNum] = new Account(accountNo, owner, money); 
				//�Է¹��� ���¹�ȣ, ������, �ݾ��� ���� ����Ʈ�� ���
				arrayNum++; //���� ����Ʈ�� ���°� ����
				System.out.println("���� ����� �Ϸ�Ǿ����ϴ�."); //���� ����� �Ϸ�Ǿ��ٴ� �޽��� ���
				break; // ���� ��� ���������� �������ͼ� ó������ ���ư�
			case "2": // 2�� ���� ����� �����ϸ�
				System.out.println("���¸�� �������Դϴ�."); //���� ��� �������� ���Դٴ� �޽��� ���
				System.out.println("���� ��ȣ \t\t ������ \t\t �ݾ�"); //���¹�ȣ, ������, �ݾ� �׸��� ���
				for(int i = 0; i<accs.length; i++) { //��ϵ� ���� ����ŭ �ݺ�
					if(accs[i] == null) break; //������ ���±��� �ٴٸ��� ��� �׸�
					System.out.println(accs[i].getAccountNo()+"\t\t"+accs[i].getOwner()+"\t\t"+accs[i].getBalance());
					//���� ���
				}
				break; //���� ��� ���������� ���
			case "3": // 3�� ������ �����ϸ�
				System.out.println("���� �������Դϴ�."); //���� �������� ���Դٴ� �޽��� ���
				System.out.print("���� ��ȣ : "); // ���¹�ȣ �Է��϶�� �޽��� ���
				accountNo = sc.nextLine(); //���¹�ȣ�� �Է¹���
				System.out.print("���ݾ� : "); //���ݾ��� �Է��϶�� �޽��� ���
				money = Integer.parseInt(sc.nextLine()); //������ �׼��� �Է¹���
				Account acc = null; 
				for (int i = 0;i<accs.length;i++) {
					if(accs[i] == null)
						break;
					else {
						if(accs[i].getAccountNo().equals(accountNo)) {
							//���� ��ȣ�� ��ġ�ϴ� Account�� ������ �ͼ� acc�� ����
							acc = accs[i];
							//acc = accs[0], acc = accs[1]; ....
							break;
						}
					}
				}
				int result = acc.getBalance() + money;
				acc.setBalance(result);
				System.out.println("");
				break;
			case "4":
				System.out.println("��� �������Դϴ�.");
				System.out.print("���� ��ȣ : ");
				accountNo = sc.nextLine();
				System.out.print("��ݾ� : ");
				money = Integer.parseInt(sc.nextLine());
				acc = null;
				for (int i = 0;i<accs.length;i++) {
					if(accs[i] == null)
						break;
					else {
						if(accs[i].getAccountNo().equals(accountNo)) {
							//���� ��ȣ�� ��ġ�ϴ� Account�� ������ �ͼ� acc�� ����
							acc = accs[i];
							//acc = accs[0], acc = accs[1]; ....
							break;
						}
					}
				}
				result = acc.getBalance() - money;
				acc.setBalance(result);
				System.out.println("");
				break;
			case "5":
				run = false; break;
				//System.exit(0);//���α׷� ����
			}
		}while(run);
			
	}
	

}