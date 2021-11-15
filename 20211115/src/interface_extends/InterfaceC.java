package interface_extends;

//다중 상속 가능함
public interface InterfaceC extends InterfaceA, InterfaceB{ //인터페이스 내에서 인터페이스를 구현할 수 없으니까 확장
	public void methodC();
}
