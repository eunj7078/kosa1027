
public class Ex14 {

	public static void main(String[] args) {
		//num = random.randint(1,6)
		int num = (int)(Math.random() * 6) + 1; // 1 ~ 6
		if (num == 1) {
			System.out.println("1�Դϴ�.");
		}else if(num == 2) {
			System.out.println("2�Դϴ�.");
		}else if(num == 3) {
			System.out.println("3�Դϴ�.");
		}else if(num == 4) {
			System.out.println("4�Դϴ�.");
		}else if(num == 5) {
			System.out.println("5�Դϴ�.");
		}else {
			System.out.println("6�Դϴ�.");
		}

	}

}