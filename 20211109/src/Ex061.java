
public class Ex061 {
	String name;
	int age;
	double height;
	//자바에서 생성자는 클래스명과 같아야 한다.
	//생성자(파이썬의 클래스에서 생성자는 1개)
//	접근지정자 클래스 (매개변수, ...)
	public Ex061(String name, int age, double height) { //void가 없어야 함
		this.name = name;
		this.age = age;
		this.height = height;
		System.out.println("생성자 실행");
	}
	//메서드 : 클래스 안에 있는 함수(파이썬과 동일)
//	접근지정자 반환형 함수명 (매개변수)
	//setter
		//반환형(void: 반환할 게 없다)
	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	//getter
	public int getAge() {
		//정수를 반환
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getheight() {
		return this.height;
	}
}
