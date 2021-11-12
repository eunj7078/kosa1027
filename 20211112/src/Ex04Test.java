
public class Ex04Test {

	public static void main(String[] args) {
		B b = new B(); //A
		C c = new C(); //A
		D d = new D(); //B, A
		E e = new E(); //C, A
		//다형성 : 부모는 자식 객체를 참조할 수 없다.
		//		:자식은 부모를 상속받아야지만 가능하다. => 상속없이 다형성을 갖는 건 불가능
		A a = b; 	//a가 b가 되었다.
		a = c; 		//a가 c가 되었다.
		a = d; 		//a가 d가 되었다.
		a = e; 		//a가 e가 되었다.
		// 다형성: 하나가 여러가지 형태를 가질 수 있다.
		
		
	}

}
