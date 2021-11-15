package runtime_exception;

public class NullPointException {

	public static void main(String[] args) {
//		String str = null;
		Point point = null; //객체가 생성되지 않았다.
		try {
			point.print();
		}catch (NullPointerException e) {
			point = new Point();
			point.print();
		}
		

	}

}
class Point{
	public void print() {
		System.out.println("출력");
	}
}