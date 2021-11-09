
public class Member {
	int age;
	double height;
	String name;
	
	public Member() {} //디폴트 생성자
	
	public Member(int age) { //나이만 저장되는 생성자 //메서드 오버로딩 //매개변수의 갯수나 타입이 서로 다를 때 매개변수의 오버로딩이라고 함
		this.age = age;
	}
	
	public Member(String name) { //이름만 초기화
		this.name = name;
	}
	
	public Member(int age, double height, String Name) { //모든 값 초기화
		this.age = age;
		this.height = height;
		this.name = name;
	}
	
	public Member(double height, int age, String Name) { //모든 값 초기화
		this.age = age;
		this.height = height;
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
}
