package springBootTest2.service.member;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import springBootTest2.command.MemberCommand;
import springBootTest2.domain.MemberDTO;
import springBootTest2.mapper.MemberMapper;

@Component
@Service
public class MemberWriteService {
	@Autowired
	MemberMapper memberMapper;
	public void execute(MemberCommand memberCommand) {
		MemberDTO dto = new MemberDTO(); //dto는 의존객체가 아니다
		dto.setMemAddr(memberCommand.getMemAddr());
		dto.setMemBirth(memberCommand.getMemBirth());
		dto.setMemEmail(memberCommand.getMemEmail());
		dto.setMemGender(memberCommand.getMemGender());
		dto.setMemId(memberCommand.getMemId());
		dto.setMemName(memberCommand.getMemName());
		dto.setMemPhone1(memberCommand.getMemPhone1());
		dto.setMemPhone2(memberCommand.getMemPhone2());
		dto.setMemPw(memberCommand.getMemPw());
		
		Integer i = memberMapper.memberInsert(dto);
		System.out.println(i + "개의 행이(가) 삽입되었습니다.");
	}
}
