
public class Ex17 {

	public static void main(String[] args) {
		// 1���� 100������ ���� ���ϴµ�, ¦���� ���Ͻÿ�
		int sum = 0;
		for (int i = 1 ; i <=100;i++) {
			if (i % 2 == 0) {
			sum += i;
			}	
		}
		System.out.println(sum);
		System.out.println("=================");
		sum = 0; 
		int i = 1;
		while (i <= 100) {
			i++;
			if (i % 2 == 0) {
				sum += i;
			}	
		}
		System.out.println(sum);
		System.out.println("=================");
		sum = 0; 
		i = 0;
		while (true) {
			i++;
			if (i > 100) break;
			if (i % 2 != 0) {
				continue;
			}	
			sum += i;
			
		}System.out.println(sum);

	}

}
