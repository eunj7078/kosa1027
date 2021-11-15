package default_method;

public abstract class ClassA { //추상 클래스
	public abstract void method01(); //추상 메서드
	public void method02() { //일반 메서드
		System.out.println("ClassA-method02");
	}
}
