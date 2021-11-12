package method_polymorphism;

public abstract class Vehicle { //추상 클래스
	public abstract void run(); //정의 되어있지 않은 메소드: 추상 메소드
	//메소드는 필요한데 내용은 필요하지 않을때 추상 메소드 사용
	//부모클래스에 있는 메소드의 내용을 사용하지 않고 자식클래스에서 재정의하여 사용하므로 부모클래스에 있는 메소드 내용이 필요없어서 내용이 없는 메소드를 만들었다 
}
