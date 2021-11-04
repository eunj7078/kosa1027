
public class Ex09 {

	public static void main(String[] args) {
		//파이썬 : not False = True; not True = False
		System.out.println(!true);
		System.out.println(!false); //파이썬의 not = 자바의 !
		boolean b = true;
		System.out.println(!b);
		System.out.println(!!b);
		boolean b1 = false;
		System.out.println(!b1); //true
		System.out.println(!!b1); //false
		//단항 연산 : !, ++, --, -
		//논리연산자 True and True
		boolean b2 = true && true;
		System.out.println(b2);
		System.out.println(true && false);
		//True or True
		System.out.println(true || true);
		System.out.println(false || false);
		// 논리연산자 : &&(파이썬에서는 and), ||(파이썬에서는 or)
		// 비교(관계)연산자: >, <, <=, >=, ==, !=
		int i = 10;
		int j = 20;
		System.out.println(i > j);
		System.out.println(i < j);
		System.out.println(i >= j);
		System.out.println(i <= j);
		System.out.println(i == j);
		System.out.println(i != j);
		boolean b3;
		b3 = i > j;
		System.out.println("b3 : "+b3);
		///문제: 윤년 구하는 문제 = 2200년은 윤년입니까?
		///4년마다 윤년, 100년마다 평년, 400년마다 윤년
		b3 = 2200 % 4 == 0 && 2200 % 100 != 0 || 2200 % 400 == 0;
		System.out.println(b3);
		
		float f = 10.1f; //10.100000000
		double d = 10.1; //10.1000000000000000000
		boolean b4;
		b4 = f == d;
		System.out.println(b4);
		b4 = (double)f == d;
		System.out.println(b4);
		b4 = f == (double)d;
		System.out.println(b4);
		
		i = 10;
		d = 10.0;
		b4 = i == d; //4byte == 8byte => 8byte == 8byte
					 //					  10.0 == 10.0
		System.out.println(b4);
		
		int i3 = 65;
		int i4 = 75;
		int i5 = 85;
		boolean b5, b6, b7;
		b5 = i3 > i4;
		b6 = i4 < i5;
		b7 = b5 && b6; //false && true
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7); //false
		b7 = i3 > i4 && i4 < i5;
		System.out.println(b7);
		
		b7 = b5 || b6; //false || true : true
		System.out.println(b7);
		b7 = i3 > i4 || i4 < i5;
		System.out.println(b7);
	}

}
