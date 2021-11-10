
public class Ex02 {

	public static void main(String[] args) {
		int [] i = new int [3];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		
		int i1 = 10;
		int i2 = 20;
		int i3 = 30;
		
		Account ac1 = new Account();
		Account ac2 = new Account();
		Account ac3 = new Account();
		
		Account [] accs = new Account[3];
		accs[0] = new Account("1111","이승무", 100);
		accs[1] = new Account();
		String [] str = new String[3];
		str[0] = "이승무";
		str[1] = "이장범";
	}

}
