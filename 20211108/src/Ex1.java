//
public class Ex1 {

	public static void main(String[] args) {
		//1. �ݺ��� ���� ���� i�� �ʱⰪ�� 1�̰� 10�� �ݺ�, ������ �� ������ i���
		for(int i = 1;i<=10;i++) {
			System.out.println(i);
		}
		
		//2. �ݺ��� ���� ���� i�� �ʱⰪ�� 1�̰� 10���� �ݺ� ������ �� �� ���� y�� �ݺ��� ������ 1�� �����ϴ� ���� ��µǵ��� �Ͻÿ�
		int y = 1;
		for(int i = 1; i <= 10; i++) {
			System.out.println(y);
			y++;
		}
		
		//3.
		for(int i = 1 ; i <= 5 ; i++) {
			int y1 = 0; // �ݺ��� �ȿ� ���� ������ ����
			y1++; //y1�� 0���� �ʱ�ȭ�� �Ǿ����Ƿ� �׻� 1�� �ȴ�.
			System.out.println(y1); //1,1,1,1,1
			//System.out.println(i); //1,2,3,4,5
		}
		
		//4.
		for (int i = 0; i<10 ; i++) { //for�� ���� ���� i�� �ݺ������� �Ѵ�.
			System.out.println("�̾��ڴ��� �������� �����ž��մϴ�.");
		}
		
		//5. �ݺ����� i�� �ʱⰪ�� 10�̰� 10�� �ݺ�
		for (int i = 10 ; i<20 ; i+=2) {
			System.out.println(i);
		}
		//5-1. continue�� ���
		for (int i = 10; i < 20 ; i++) {
			if(i % 2 != 0) continue;
			System.out.println(i);
			}
		
		//7. i�� �ʱⰪ�� 10�̰� 25ȸ �ݺ��ϵ� i�� 4�� ����
		int y2 = 1;
		for (int i2 = 10;i2<=109;i2=+4) {
			System.out.println(y2);
			y2++;
		}
		//i�� �ʱⰪ�� 12�̰� 20ȸ �ݺ��� �� ��
		//�����ڴ� �鿩���⸦ ���ؾ� �մϴٸ� 4ȸ ���
		for(int i3 = 12 ; i3<32 ; i3+=5) {
			System.out.println("������ ���Ϸ��� �ڹٸ� ���̼ž� �մϴ�");
		}
			
		//������ 7���� ����ϵ� Ȧ������ ����ϵ� �ݺ������� ������� �� ��.
		int y3 = 1;
		for(int i4 = 1;i4<=9;i4++) {
			System.out.println("7 + "+ y3 +" = "+ 7 * y3);
			y3++;
		}
		//Math.random()�Լ��� �̿��ؼ� 1~45�� �� �ϳ��� ���� �޾� �� ����ŭ �ݺ��Ͻÿ�
//		int i = (int)(Math.random()*45)+1;
//		for(int a = 1;a<=i;a++) {
//			System.out.println("������ ���Ϸ��� �ڹٸ� ���̼ž��մϴ�");
//		}
		//1���� 10�� �ݺ��� �� Math.random()���� 1���� 45������ ���� �޾� ¦���� ���� 3�� ���ؼ� ����Ͻÿ�
		//�� 10ȸ �ݺ��� �Ǿ�� �Ѵ�.
		for(int a = 0 ; a < 10 ; a++) {
			int num = (int)(Math.random()*45)+1;
			if(num % 2 == 0) {
				System.out.println("3 * "+ num + " = " + 3*num);
			}else a--;
		}
		// x = 10; y = 19; z = 2�϶� i�� �ʱⰪ x�� ������ y��ŭ �ݺ��� �ϵ� z��ŭ �����Ͻÿ�
		int x = 1;
		int y4 = 10;
		int g = 2;
		for(int i1 = x;i1<=y4;i1+=g) {
			System.out.println(i1);
		}
		//���� i�� 1���� 10���� �ݺ��ϰ�, ���� j�� 100���� 90�� �� ������ �ݺ��Ͽ� "���α׷��� ���Ϸ��� �鿩���⸦ ������"�� ����Ͻÿ�
		for (int i=1, j = 100; i<=10&&j>90 ; i++, j--) {
			System.out.println("���α׷��� ���Ϸ��� �鿩���⸦ ������");	
		}
		//
		
		for (int i = 4 ; i <= 6 ; i++) {
			System.out.println(i + "�� ����");
			for (int j = 3 ; j <= 8; j++) {
				System.out.println(i + " * " + j + " = " + i*j+"        ");
			}		 
			System.out.println(i + "�� ��");
		}
		 System.out.println("==================");
		 
		for (int i = 4 ; i <= 6 ; i++) {
			System.out.println(i + "�� ����");
			for (int j = 3 ; j <= 8; j++) {
				System.out.print(i + " * " + j + " = " + i*j+"        ");
			}		 
			System.out.println();
			System.out.println(i + "�� ��");
		}
		 System.out.println();
		 
		 System.out.println("<table>");
			for (int i = 0;i<=4;i++) {
				System.out.println("<tr><td> 1 </td><td> 2 </td><td> 3 </td><td> 4 </td><tr>");
				i++;
			}
			System.out.println("</table>");

	}

}
