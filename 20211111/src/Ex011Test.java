
public class Ex011Test {

	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();           //stack                   heap
		Ex01 ex02 = ex01;		// ex01       10000        10000    first|second|    
								// ex02       10000        
		Ex01 ex03 = new Ex01();	// ex03       20000        20000    first|second| 
		ex01.first = 30;
		System.out.println(ex01.first); //30
		System.out.println(ex02.first); //30
		System.out.println(ex03.first); //0
		
		if(ex01 == ex02) { //2개가 서로 같은 객체냐고 물어봄
			System.out.println("ex01과 ex02는 같은 객체이다");
		}else {
			System.out.println("다른 객체이다");
		}
		if(ex01 == ex03) { //2개가 서로 같은 객체냐고 물어봄
			System.out.println("ex01과 ex03은 같은 객체이다");
		}else {
			System.out.println("ex01과 ex03은 다른 객체이다");
		}
		//static 키워드가 있는 멤버 변수는 객체 생성 없이 클래스명으로 사용할 수 있다.
		int result = Singleton.val; // 외부에서 직접 접근
		System.out.println(result);
		//Singleton s = Singleton.singleton;
		Singleton s = Singleton.getInstance(); // s = 30000
		Singleton s1 = Singleton.getInstance(); // s1 = 30000
		if(s == s1) { //2개가 서로 같은 객체냐고 물어봄
			System.out.println("s1과 s2는 같은 객체이다");
		}else {
			System.out.println("s1과 s2는 다른 객체이다");
		}
	}

}
