package field_polymorphism;

public class Car { 
	//부모 변수에 자식 개체를 대입할 수 있다. 자동형 변환
	//Tire frontLeftTire = new Tire(); => 인터페이스는 객체생성이 불가능
	Tire frontLeftTire = new KumhoTire();
	Tire frontRightTire = new KumhoTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	
	
}
