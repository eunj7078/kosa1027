package abstract_class;

//추상 클래스는 상속해서 사용하고, 추상메서드를 재정의해서 사용해야 한다.
public class SmartPhone extends Phone{
	//자식 클래스에서는 abstract를 사용할 수 없다
	//추상 클래스를 상속을 받으면 추상 메서드를 재정의하여 사용한다.

	public SmartPhone(String owner) {
		super(owner);
	}
	
	@Override
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
		
	} 
	
	
}
