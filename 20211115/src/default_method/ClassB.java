package default_method;

public class ClassB extends ClassA{
	public void method03() {
		System.out.println("ClassB-method03");
	}

	//추상 메소드 오버라이딩
	//일반 메소드는 굳이 오버라이딩할 필요는 없음
	@Override
	public void method01() { //추상메서드
		System.out.println("ClassB-method01");	
	}
	//상속받은 일반 메서드는 오버라이드 하지 않아도 됨
}
