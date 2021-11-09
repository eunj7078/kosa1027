
public class Ex18 {

	public static void main(String[] args) {
		// 3단부터 7단까지 while문으로
		
		int gop = 1;
		while(gop<=9) {
			System.out.println("3 * " + gop + " = " + 3*gop);
			gop++;
		}
		gop = 1;
		while(gop<=9) {
			System.out.println("4 * " + gop + " = " + 4*gop);
			gop++;
		}
		gop = 1;
		while(gop<=9) {
			System.out.println("5 * " + gop + " = " + 5*gop);
			gop++;
		}
		gop = 1;
		while(gop<=9) {
			System.out.println("6 * " + gop + " = " + 6*gop);
			gop++;
		}
		gop = 1;
		while(gop<=9) {
			System.out.println("7 * " + gop + " = " + 7*gop);
			gop++;
		}
		System.out.println("=================");
		int dan = 3;
		
		while(dan <= 7) {
			gop = 1;
			while(gop <= 9) {
			System.out.println(dan + " * " + gop + " = " + dan*gop);
			gop++;
			}
			dan++;
		}
	}
}
