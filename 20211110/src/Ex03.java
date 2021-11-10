
public class Ex03 {
	int first;
	int second;
	static int val; //정적 변수
	int val1;
	public int add(/* Ex03 this */) { //멤버 메서드 
		return val + this.first;
	}
	public static int sub() { //static 메서드
		//return val - val1; //static 메서드 내에서는 instance 변수를 사용할 수 없다
		
		return val;
	}
}
