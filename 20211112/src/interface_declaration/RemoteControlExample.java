package interface_declaration;

public class RemoteControlExample {

	public static void main(String[] args) {
		/*
		 * Audio audio = new Audio(); 
		 * Television television = new Television();
		 */	
		RemoteControl r; //������ �̿�
		
		r = new Audio(); //����� ���
		r.turnOn(); 
		r.turnOff();
	
		r = new Television(); //Ƽ�� ���
		r.turnOn();
		r.turnOff();
	}
}
