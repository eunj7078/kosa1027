
public class Ex02 {

	public static void main(String[] args) {
		byte b;
		b = -128;
		System.out.println(b);
		b = 127;
		System.out.println(b);
		//b = -129;
		//b = 128;
		char ch = 0; //유니코드: 정수에 해당하는 문자
		System.out.println(ch);
		ch = 65535; //특수문자 ?
		System.out.println(ch);
		ch = 65; //대문자 A
		System.out.println(ch);
		ch = 97; //소문자 a // 소문자 = 대문자 + 32
		System.out.println(ch);
		ch = 'A' + 32;
		System.out.println(ch);
		//char: 문자를 나타내주는 자료형 => 양수만
		ch = '가';
		System.out.println(ch);
		System.out.println((int)ch); //44032
		ch = 44032;
		System.out.println(ch);
		short sh = -32768;
		System.out.println(sh);
		//sh = -32769;
		//sh = 32768;
		int i = -2147483648;
		System.out.println(i);
		i = 2147483647;
		System.out.println(i);
		
		float f; 
		f = 3.4f;
		System.out.println(f);
		double d = 3.4; //8바이트
		System.out.println(d);
		
		long l = 10;
		System.out.println(l);
		l = 2000000000001l; //l을 붙여주면 4바이트로 처리가능
		System.out.println(l);
		
		//정수의 기본 크기는 4바이트
		//실수는 기본 크기는 8바이트
	}

}
