
public class Ex05 {
	//캡슐화 = 멤버필드와 메소드를 묶어놓은 것
	private int age;
	//접근지정자
	private double height;
	String name;
	public void setAge(int age) { //메소드를 통해서만 접근할 수 있게끔
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getAge() {
		return this.age;
	}
	public double getDouble() {
		return this.height;
	}
}
