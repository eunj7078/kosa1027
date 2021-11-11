
public class Singleton {
	int first;
	int second;
	//private 
	static int val = 10;
	//자기 자신의 객체를 미리 만들어 놓고 사용
	//싱글톤
	private static Singleton singleton = new Singleton(); //30000
	private Singleton() {}
	public static Singleton getInstance() { //자신의 객체를 전달
		//싱글턴 객체를 사용할때는 getInstance을 사용하도록 개발자끼리의 암묵적인 약속, 이름은 아무거나 해도 괜찮다
		//직접 접근이 안되기 때문에 리턴할 수 있도록 함수를 만들었다.
		return singleton;
	}
	///
	
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
}
