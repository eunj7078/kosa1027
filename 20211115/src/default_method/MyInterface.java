package default_method;

//재정의해도 되고 안해도 되는 인터페이스
public interface MyInterface {
	public void method1();
	
	//오버라이드를 할 수도 있고 안할 수도 있는 메서드
	public default void method2() {
		System.out.println("MyInterface-method2 실행");
	}
}
