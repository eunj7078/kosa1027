package runtime_exception;

public class MultiExceptionEx1 {
	public static void main(String[] args) {
		int data1 = Integer.parseInt(args[0]);
		int data2 = Integer.parseInt(args[1]);
		
		try {
			System.out.println(data1);
			System.out.println(data2);
			
			System.out.println(data1 / data2);
		}catch (Exception e) { //��� ������ ó��
			System.out.println("�Է°��� 2���̾�� �մϴ�.");
			if(data2 == 0) {
				System.out.println(0);	
			}
			else {
					System.out.println(data1 / data2);	
			}
				
		}
			
	}
}
