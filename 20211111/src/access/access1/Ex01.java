package access.access1;

public class Ex01 {
	//멤버 필드에 접근 지정자를 주지 않으면 기본적으로 default 접근 지정자가 된다.
	//default 접근 지정자는 다른 패키지에 있는 클래스에 상속이 되지 않는다.
	//default는 다른 패키지에 있는 클래스에서 사용하지 못한다.
	int first; //따로 적어주지 않으면 default => 다른 패키지에서 상속이 불가능
	int second;
	int result;
	
	public void add() {
		result = first + second;
	}
	
	public void div() {
		result = first / second;
	}
	
	
}
