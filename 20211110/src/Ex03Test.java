
public class Ex03Test {

	public static void main(String[] args) { 
		Ex03 ex031 = new Ex03();
		ex031.first = 10;
		ex031.second = 20;
		ex031.val = 30;
		Ex03 ex032 = new Ex03();
		System.out.println(ex032.first); //0
		System.out.println(ex032.second); //0
		System.out.println(ex032.val); //30
		System.out.println(Ex03.val); //30
		int result = ex031.add();
		System.out.println(result); //30+10
		result = ex032.add();
		System.out.println(result);
		
		result = Ex03.sub(); // static에서 instance명을 사용할 수 없기 때문에 클래스 명을 붙여줌
		// 메서드의 static 키워드에는 클래스 명을 이용해서 사용하기 위한 메소드이다.
		// 메서드 내에서 this 키워드를 사용할 수 없다.
		System.out.println(result);

	}

}
