
public class Ex09 {

	public static void main(String[] args) {
		// 7단에서 홀수만 출력
		System.out.println("7 * "+ 1 + " = " + 7 * 1);
		System.out.println("7 * "+ 3 + " = " + 7 * 3);
		System.out.println("7 * "+ 5 + " = " + 7 * 5);
		System.out.println("7 * "+ 7 + " = " + 7 * 7);
		System.out.println("7 * "+ 9 + " = " + 7 * 9);
		System.out.println("===================");
		
		int num;
		for (num=1;num<10;num+=2) {
			System.out.println("7 * "+ num + " = " + 7 * num);
		}
	}
}
