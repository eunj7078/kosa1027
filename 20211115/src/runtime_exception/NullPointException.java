package runtime_exception;

public class NullPointException {

	public static void main(String[] args) {
//		String str = null;
		Point point = null; //��ü�� �������� �ʾҴ�.
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
		System.out.println("���");
	}
}