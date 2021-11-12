package interface_declaration;

public interface RemoteControl {
	//생성자와 필드, 일반 메소드가 없다
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	////자바 8버전부터 추가
	//디폴트 메소드
	default void setMute(boolean mute) { //일반메서드 = public
		if(mute) {
			System.out.println("무음 처리를 한다.");
		}else {
			System.out.println("무음 해제를 한다.");
		}
	}
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}

}
