package inheritence;

public class Ex09 extends Ex08{
	//public Ex09() {} //기본생성자 사용 불가능
	int val;
	//부모 클래스에 생성자가 있을 경우 자식 클래스에서는 부모 클래스에 값을 전달하기 위한 생성자가 반드시 있어야 함
	public Ex09(int first, int second, int val) { //부모 클래스에 값을 전달하기 위한 생성자 필요함
		super(first, second);
		this.val = val;
	}
	public void sub() {
		result = first - second;
	}
	public void mul() {
		result = first * second;
	}
	@Override
	public void div() { // 부모가 가진 메서드를 자식에서 재정의 한다.
		if(second == 0) {
			result = 0;
		}else {
			result = first / second;
		}
	}
	//부모가 가진 div를 그대로 사용 가능
	public void div1() { //재정의된 부모 클래스에 있는 메서드를 호출한다.
		super.div();
	}
}
