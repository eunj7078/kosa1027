package runtime_exception;

public class ClassNotFoundExceptionEx {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.util.List1");
			System.out.println("클래스가 있습니다.");
		}catch (ClassNotFoundException e) {
			e.printStackTrace(); //에러메세지를 출력 => 프로그램이 종료된건 아니야
			//개발자가 어떠한 오류인지 확인하기 위한 코드
			//System.out.println("클래스가 없습니다.");
		}	
		System.out.println("프로그램 끝");
	}
}
