
public class Ex12 {

	public static void main(String[] args) {
		/* num = 1 : 전역변수
		 * def test():
		 * 		num = 100 : 지역 : 블럭변수(자바)
		 * 		print(num)
		 * 
		 * test()
		 * print(num)
		 */
		
		for(int i = 1 ; i<=10 ; i++) {
			System.out.println(i);	
			int a = 10;
			//변수 i와 a는 블럭 변수(블럭 안에서만 사용이 가능)
		}
		/* 블럭 밖에서 사용하려고 하면 오류가 발생한다.
		System.out.println(a);
		System.out.println(i); //블럭 밖에서 i를 사용할 수 없다
		*/
		int num;
		for (num=1;num<=10;num++) {
			System.out.println(num);
			//블럭 밖에 있는 변수 num은 블럭 안에서 사용가능하다.
		}

	}

}
