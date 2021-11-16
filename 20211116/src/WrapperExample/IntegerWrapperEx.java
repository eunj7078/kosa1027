package WrapperExample;

public class IntegerWrapperEx {

	public static void main(String[] args) {
		int i = 10;
		String s = "10";
		
		Integer i1 = 10; //포장 클래스 //정수 자료형 (=int)
		i1 = Integer.parseInt(s); //문자열 값을 숫자로 저장
		
		byte by = 10;
		Byte by1 = 10;
		
		short sh = 10; //일반 자료형
		Short sh1 = 10;
		
		double d = 10.5;
		Double d1 = 10.5;
		
		float f = 10.5f;
		Float f1 = 10.6f;
		//f= null; //일반 자료형은 null값 저장 불가능
		//null : 값은 존재하되 어떠한 값인지를 모르는 것
		f1 = null; //문자열을 숫자로 변환하기도 쉽지만, null값을 저장하기 위해서 사용한다.
		
		
		
	}

}
