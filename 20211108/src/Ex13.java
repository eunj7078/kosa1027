
public class Ex13 {

	public static void main(String[] args) {
		//3�� 4���� 2���� �迭�� 1~100���� ����ϴ� Math.random()�� �̿��Ͽ� 
		//���� �Է��� �� �հ踦 ����Ͻÿ�.
		
		
		int i [][] = new int [3][4];
		int sum = 0;
		for (int j = 0;j < i.length;j++) {
			for (int k = 0;k < i[j].length;k++) {
				int a = (int)(Math.random()*100)+1;
				i[j][k] += a;
				System.out.print(i[j][k]+"    ");
			}
			System.out.println("");
		}
		for (int j = 0;j < i.length;j++) {
			for (int k = 0;k < i[j].length;k++) {
				sum += i[j][k];
			}
		}
		System.out.println(sum);
		
		sum  = 0;
		for (int [] row:i) {
			for(int col : row) {
				sum +=col;
			}
		}
		System.out.println(sum);
		
		int [] score = {60, 89, 56, 73, 66, 90, 95};
		sum  = 0;
		for (int a : score) {
			sum += a;
		}
		System.out.println("�հ�: "+sum);
		System.out.println("���: "+sum/score.length);
		

	}

}
