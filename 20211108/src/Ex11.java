
public class Ex11 {

	public static void main(String[] args) {
		// 4�� 5��¥�� �迭�� ���� Math.random()�� �̿��Ͽ� ���� �����Ͻÿ�.
		// ������ 1~100
		
		int a[][] = new int [4][5];
		
		for (int j = 0;j<a.length;j++) {
			for(int k = 0 ;k<a[j].length ; k++) {
				int i = (int)(Math.random()*100)+1;
				a[j][k] += i;
				System.out.print(a[j][k]+"  ");
			}
			System.out.println("");
		}
		System.out.println("==================");
		
//		int row = 0;
//		while(row < a.length) {
//			int col = 0;
//			while(col<a[row].length) {
//				a[row][col] = (int)(Math.random()*100)+1;
//				col++;
//				System.out.print(a[row][col]+"  ");
//			}
//			row++;
//			System.out.println("");
//		}
		
		
	}

}
