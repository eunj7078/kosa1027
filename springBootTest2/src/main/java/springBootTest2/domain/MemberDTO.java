package springBootTest2.domain;

import java.util.Date;

import lombok.Data;

@Data
public class MemberDTO {//DTO는 데이터베이스의 컬럼
	String memNum;
	String memName;
	Date memRegiDate;
	String memId;
	String memPw;
	String memPhone1;
	String memPhone2;
	String memAddr;
	String memEmail;
	String memGender;
	Date memBirth;
}
