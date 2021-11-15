
public interface Ex03 {
	//인터페이스: 상수, 추상 메서드를 가지고 있다.
	static final int FIRST = 10; //상수
	public void method01(); //추상 메서드 //오버라이딩을 해서 사용하겠다.
	//생성자가 없다.
	//일반 메서드가 필요하지 않다. => 일반 메서드가 없다. //멤버필드가 없다.
	//메서드가 하는 역할은 외부로부터 멤버필드에 값을 전달받거나,
	//멤버필드의 값을 외부에 전달하기 위해서 사용, setter/getter
	default void method02() {
		System.out.println("default-method");
	}
	static void method03() {
		System.out.println("static-method");
	}
}
