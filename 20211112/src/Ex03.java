
public class Ex03 extends Ex02{ //자식 클래스
	String subject;
	public Ex03(int radius, double pi, String subject) {
		super(radius, pi);
		this.subject = subject;
	}
	@Override
	public double area() { //부모로부터 상속받은 애를 재정의 
		return radius * radius * Math.PI;
	}
	public double area(double p) { //오버로딩
		return radius * radius * p; 
	}
	public double area1() { //부모 클래스의 것을 사용하겠다.
		return super.area();
	}
}
