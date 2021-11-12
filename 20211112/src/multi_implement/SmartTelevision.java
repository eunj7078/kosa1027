package multi_implement;

//클래스와 인터페이스 간에는 다중상속이 된다.
public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
		
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {} //정의할게 없는데 정의하라고 하니까 정의안함
	
}
