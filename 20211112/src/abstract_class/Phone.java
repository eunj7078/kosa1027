package abstract_class;

public abstract class Phone { //부모 클래스 : 추상 클래스 = 추상 메소드를 가지고 있는 클래스
	public String owner;
	public Phone(String owner) {
		this.owner = owner;
	}
	public abstract void turnOn();		// 추상화 = 정의되어있지 않은 메서드
	public abstract void turnOff();		// 추상화
}
