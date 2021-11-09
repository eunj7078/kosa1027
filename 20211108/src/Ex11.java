
public class Ex11 {

	public static void main(String[] args) {
		// 4행 5열짜리 배열을 만들어서 Math.random()을 이용하여 값을 저장하시오.
		// 랜덤은 1~100
		
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
