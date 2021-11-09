
public class Ex02test {

	public static void main(String[] args) {
		int i = 10;
		// cal = calulator()
		// cal1 = calulator()
		Ex02 ex02 = new Ex02(); //클래스의 첫글자는 무조건 대문자 => 변수와 헷갈리지 않게 하기 위해
//		자료형 변수명
		
		ex02.addr = "분당";
		ex02.age = 35;
		ex02.name = "이숭무";
		ex02.gender = false;
		System.out.println(ex02.addr);
		System.out.println(ex02.gender);
		
		Ex02 ex021 = new Ex02();
		ex021.addr = "분당";
		ex021.age = 18;
		ex021.name = "이상범";
		System.out.println(ex02.name);
		
	}

}
