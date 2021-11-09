import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		//num = int(input("첫번째 숫자를 입력해주세요."))
		//Scanner
//		Scanner sc = new Scanner(System.in); //입력창을 만들어주기 위한 명령어
//		System.out.print("이름을 입력하세요.: ");
//		String name = sc.next(); //커서 깜박이는건 실행중, 엔터쳐지기 전에 실행이 종료가 안됨
//		System.out.println("이름은 " + name);
//		System.out.print("숫자를 입력해주세요.: "); //이렇게 따로 적어주어야 보인다.
//		int num = sc.nextInt();
//		System.out.println("숫자 : " + num);
		
		//문제: 단과 곱의 범위를 입력받아 구구단을 출력하시오.
		Scanner sc = new Scanner(System.in);
		while (true) { //무조건 한번은 실행하기 위해서 true를 사용 /파이썬 방식: 파이썬에서는 do while이 없기 때문에 while ~ true를 사용
			System.out.print("시작하려는 단을 입력하세요.: ");
			int startDan = sc.nextInt();
			System.out.print("마지막 단을 입력하세요.: ");
			int endDan = sc.nextInt();
			System.out.print("시작하려는 곱을 입력하세요.: ");
			int startGop = sc.nextInt();
			System.out.print("마지막 곱을 입력하세요.: ");
			int endGop = sc.nextInt();
			int i;
			int j;
			for (i = startDan;i<=endDan;i++) {
				for(j = startGop;j<=endGop;j++) {
					System.out.println(i + " * "+ j + " = "+ i*j);
				}
				
			}
			System.out.println("종료하려면 'y', 아니면 아무키나." );
			String stop = sc.next();
			if(stop.equals("y")) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
