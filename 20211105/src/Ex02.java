
public class Ex02 {

	public static void main(String[] args) {
		//Math.random() : 0 <= Math.random() < 1
		int num = (int)(Math.random() * 5 + 1); //(0~4) +1
		System.out.println(num);
		if (num == 1) { //위에서부터 비교
			System.out.println('A');
		} else if (num == 2) {
			System.out.println('B');
		} else if (num == 3) {
			System.out.println('C');
		} else if (num == 4) {
			System.out.println('D');
		} else if (num == 5) {
			System.out.println('E');
		}
		System.out.println("=========switch==========");
		switch(num) { //바로 num값을 찾아감 => 조건식이 많을수록 if보다는 switch를 쓰는게 더 좋다.
		case 1 : System.out.println('A'); break;
		case 2 : System.out.println('B'); break;
		case 3 : System.out.println('C'); break;
		case 4 : System.out.println('D'); break;
		case 5 : System.out.println('E'); break;
		}
	}

}
