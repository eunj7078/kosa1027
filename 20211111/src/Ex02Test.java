
public class Ex02Test {

	public static void main(String[] args) {
		//final 변수는 생성자를 통해서 초기화를 할 수는 있지만
		Ex02 ex02 = new Ex02(10, 20, "STring"); //final 변수 초기화
		//초기화된 값을 변경하지 못한다. : final
		//ex02.first = 20; //값 변경 불가능
		Ex02 ex021 = new Ex02(30, 40, "string");
		System.out.println(ex02.first);
		System.out.println(ex021.first); //변경은 못하지만 별개로 줄 수는 있다
		//객체마다 final변수의 값을 별개로 가질 수 있다.
	}

}
