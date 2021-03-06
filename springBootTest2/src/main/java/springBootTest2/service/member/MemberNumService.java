package springBootTest2.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import springBootTest2.mapper.MemberMapper;

@Component
@Service
public class MemberNumService {
	@Autowired
	MemberMapper memberMapper;
	public String execute() {
		String memNum = memberMapper.numberGenerate();
		System.out.println(memNum);
		return memNum;
	}
}
