
public class Ex13 {

	public static void main(String[] args) {
		// 5���� ����ϼ���.
		
		int gop;
		for(gop = 1;gop<10;gop++) {
			System.out.println("5 * "+gop+" = " + 5*gop);
		}
		//6�� ���
		for(gop = 1;gop<10;gop++) {
			System.out.println("6 * "+gop+" = " + 6*gop);
		}
		//7�� ���
		for(gop = 1;gop<10;gop++) {
			System.out.println("7 * "+gop+" = " + 7*gop);
		}
		System.out.println("=================");
		for(int dan = 5;dan<=7;dan++) {
			for(gop = 1;gop<10;gop++) {
				System.out.println(dan+" * "+gop+" = " + dan*gop);
			}
			
		}
	}
}
