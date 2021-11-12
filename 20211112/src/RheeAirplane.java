
public class RheeAirplane extends Airplane{
	//상수 = 변수명 대문자
	static final int NORMAL = 1; 		//일반 비행
	static final int SUPERSONIC = 2; 	//초음속 비행
	
	int flyMode = NORMAL; //1
	
	public void fly() { //오버라이딩
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행을 한다.");
		}else {
			super.fly();
		}
	}
	
}
