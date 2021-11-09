
public class Ex13 {

	public static void main(String[] args) {
		//3행 4열인 2차원 배열에 1~100까지 사용하는 Math.random()을 이용하여 
		//값을 입력한 후 합계를 출력하시오.
		
		
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
		System.out.println("합계: "+sum);
		System.out.println("평균: "+sum/score.length);
		

	}

}
