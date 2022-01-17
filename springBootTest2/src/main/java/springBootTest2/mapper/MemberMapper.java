package springBootTest2.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import springBootTest2.domain.MemberDTO;

@Component
@Repository(value="springBootTest2.mapper.MemberMapper")
public interface MemberMapper {
	public List<MemberDTO> selectAll();
	public MemberDTO selectOne(String memNum);
	public Integer memberDelete(String memNum);
	public Integer memberInsert(MemberDTO dto);
	public Integer memberUpdate(MemberDTO dto);
	public String numberGenerate();
}