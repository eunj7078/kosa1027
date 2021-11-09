
public class LoginMember {
	String userId;
	String userPw;
	public LoginMember(String userId, String userPw) {
		this.userId = userId;
		this.userPw = userPw;
	}
	public int login(String userId, String userPw) {
		if(this.userId.equals(userId)) {
			if(this.userPw.equals(userPw)) {
				return 1; //로그인 성공 
			}else {
				return 0; //비밀번호 틀림
			}
		}else {
			return -1; //아이디 틀림
		}
	}
	public void logout(String userId){
		System.out.println("로그아웃 되었습니다.");
	}
	
}
