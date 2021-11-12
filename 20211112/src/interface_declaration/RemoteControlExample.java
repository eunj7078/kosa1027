package interface_declaration;

public class RemoteControlExample {

	public static void main(String[] args) {
		/*
		 * Audio audio = new Audio(); 
		 * Television television = new Television();
		 */	
		RemoteControl r; //다형성 이용
		
		r = new Audio(); //오디오 사용
		r.turnOn(); 
		r.turnOff();
	
		r = new Television(); //티비 사용
		r.turnOn();
		r.turnOff();
	}
}
