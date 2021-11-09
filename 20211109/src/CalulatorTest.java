
public class CalulatorTest {

	public static void main(String[] args) {
		Calulator cal = new Calulator(); //외부: 객체 생성을 위해 사용하는 경우
		Calulator cal1 = new Calulator();
		cal.add(10, 20);
		System.out.println(cal.result);
		cal1.add(20, 30);
		System.out.println(cal1.result);
	}

}
