import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Account acc = new Account("1111", "이승무", 100); 
		 * Account acc1 = new Account("2222", "이상범", 100); 
		 * Account acc2 = new Account("3333", "이장범", 100);
		 */
		int arrayNum = 0; // 배열의 현재 번호 가지기 위한 변수
		Account [] accs = new Account[100]; //100개의 계좌를 만들자고 배열로 지정
		//배열의 index는 0번부터 시작
		boolean run = true; //무한루프를 돌리기 위한 부울 변수
		//while(run) {
		do {
			System.out.println("1. 계좌등록 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료"); //선택지
			System.out.print("선택 > "); //문자로 입력받음
			String selecNo = sc.nextLine(); //숫자로 변형 => int selecNo = sc.nextInt();
			//int selecNo = sc.nextInt(); sc.nextLine;// 입력장치에 \n값이 있는 것을 없애기 위해 사용
			                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
			switch(selecNo) { //무엇을 선택했냐에 따라 무엇을 할 지 달라짐
			case "1": //1번을 선택하면 = 계좌 등록을 선택하면
				System.out.println("계좌등록 페이지입니다."); //계좌등록 페이지라는 메시지 출력
				System.out.print("계좌 번호 : "); //계좌번호를 입력하라는 메시지 출력
				String accountNo = sc.nextLine();  //사용자에게서 계좌번호를 입력받음
				System.out.print("예금 주 : "); //예금주를 입력하라는 메시지 출력
				String owner = sc.nextLine(); //예금주를 입력받음
				System.out.print("금액 : "); //금액을 입력하라는 메시지 출력
				int money = sc.nextInt(); //금액을 입력받음
				accs[arrayNum] = new Account(accountNo, owner, money); 
				//입력받은 계좌번호, 예금주, 금액을 계좌 리스트에 등록
				arrayNum++; //계좌 리스트에 계좌가 생성
				System.out.println("계좌 등록이 완료되었습니다."); //계좌 등록이 완료되었다는 메시지 출력
				break; // 계좌 등록 페이지에서 빠져나와서 처음으로 돌아감
			case "2": // 2번 계좌 목록을 선택하면
				System.out.println("계좌목록 페이지입니다."); //계좌 목록 페이지로 들어왔다는 메시지 출력
				System.out.println("계좌 번호 \t\t 계좌주 \t\t 금액"); //계좌번호, 계좌주, 금액 항목을 출력
				for(int i = 0; i<accs.length; i++) { //등록된 계좌 수만큼 반복
					if(accs[i] == null) break; //마지막 계좌까지 다다르면 출력 그만
					System.out.println(accs[i].getAccountNo()+"\t\t"+accs[i].getOwner()+"\t\t"+accs[i].getBalance());
					//계촤 출력
				}
				break; //계좌 출력 페이지에서 벗어남
			case "3": // 3번 예금을 선택하면
				System.out.println("예금 페이지입니다."); //예금 페이지에 들어왔다는 메시지 출력
				System.out.print("계좌 번호 : "); // 계좌번호 입력하라는 메시지 출력
				accountNo = sc.nextLine(); //계좌번호를 입력받음
				System.out.print("예금액 : "); //예금액을 입력하라는 메시지 출력
				money = Integer.parseInt(sc.nextLine()); //예금할 액수를 입력받음
				Account acc = null; 
				for (int i = 0;i<accs.length;i++) {
					if(accs[i] == null)
						break;
					else {
						if(accs[i].getAccountNo().equals(accountNo)) {
							//계좌 번호가 일치하는 Account를 가지고 와서 acc에 저장
							acc = accs[i];
							//acc = accs[0], acc = accs[1]; ....
							break;
						}
					}
				}
				int result = acc.getBalance() + money;
				acc.setBalance(result);
				System.out.println("");
				break;
			case "4":
				System.out.println("출금 페이지입니다.");
				System.out.print("계좌 번호 : ");
				accountNo = sc.nextLine();
				System.out.print("출금액 : ");
				money = Integer.parseInt(sc.nextLine());
				acc = null;
				for (int i = 0;i<accs.length;i++) {
					if(accs[i] == null)
						break;
					else {
						if(accs[i].getAccountNo().equals(accountNo)) {
							//계좌 번호가 일치하는 Account를 가지고 와서 acc에 저장
							acc = accs[i];
							//acc = accs[0], acc = accs[1]; ....
							break;
						}
					}
				}
				result = acc.getBalance() - money;
				acc.setBalance(result);
				System.out.println("");
				break;
			case "5":
				run = false; break;
				//System.exit(0);//프로그램 종료
			}
		}while(run);
			
	}
	

}
