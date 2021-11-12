import java.util.Scanner;

public class Ho01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sel = null;
		boolean exe = true;
		do {
			System.out.println("1. 계좌등록 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.print("선택 > ");
			sel = sc.nextLine();
			switch(sel) {
			case "1": 
				System.out.println("계좌등록 페이지 입니다."); 
				System.out.print("계좌 번호를 입력해주세요. : ");
				String num = sc.nextLine();
				System.out.print("예금주를 입력해주세요. : ");
				String num2 = sc.nextLine();
				System.out.print("금액을 입력해주세요. : ");
				int num3 = sc.nextInt();
				break;
			case "2": 
				System.out.println("계좌 목록 페이지 입니다."); 
				
				break;
			case "3": 
				System.out.println("예금 페이지 입니다.");
				
				break;
			case "4": 
				System.out.println("출금 페이지 입니다."); 
				
				break;
			case "5": 
				System.out.println("프로그램을 종료합니다."); 
				exe = false;
				break;
			}		
		}while(exe);
		
		
		
		
	}

}
