package main.DTO;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CachedMemberDao {
	static long nextId = 0;
	static Map<String, MemberDTO> map = new HashMap<String, MemberDTO>();
	public void update(MemberDTO dto) {
		map.put(dto.getEmail(), dto); //map은 key가 같으면 update, 없으면 insert
	}
	public MemberDTO selectByEmail(String email) {
		return map.get(email);
	}
	public Collection<MemberDTO> selectAll(){
		return map.values();
	}
	public void insert(MemberDTO dto) {
		dto.setId(++nextId);
		map.put(dto.getEmail(), dto);
	}
}
