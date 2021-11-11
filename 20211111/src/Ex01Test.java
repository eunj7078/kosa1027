
public class Ex01Test {

	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		Ex01 ex02 = new Ex01();
		Ex01 ex03 = new Ex01();

		if(ex01 == ex02) { //2개가 서로 같은 객체냐고 물어봄
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		ex01.first = 20;
		System.out.println(ex02.first);
		System.out.println(ex01.first);
		//서로 다른 값을 갖고 있다 = 서로 다른 객체이다
		
		Singleton s1 = Singleton.getInstance();//30000
		Singleton s2 = Singleton.getInstance();//30000
		
		if(s1 == s2) { //2개가 서로 같은 객체냐고 물어봄
			System.out.println("s1과 s2는 같다");
		}else {
			System.out.println("s1과 s2는 다르다");
		}
	}

}
