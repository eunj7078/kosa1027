package springBootTest2.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import springBootTest2.command.LibCommand;
import springBootTest2.domain.AuthInfo;
import springBootTest2.domain.LibraryDTO;
import springBootTest2.mapper.LibraryMapper;

@Component
@Service
public class LibWriteService {
	@Autowired
	LibraryMapper libraryMapper;
	public void execute(LibCommand libCommand, HttpServletRequest request) {
		HttpSession session = request.getSession();
		AuthInfo authInfo = (AuthInfo)session.getAttribute("authInfo");
		LibraryDTO dto = new LibraryDTO();
		dto.setIdAddr(request.getRemoteAddr()); //ip주소
		dto.setMemId(request.getRemoteUser()); //아이디
		dto.setLibWriter(libCommand.getLibWriter()); //글쓴이
		dto.setLibSubject(libCommand.getLibSubject()); //글제목
		dto.setLibContent(libCommand.getLibContent()); //내용
		dto.setLibPw(libCommand.getLibPw()); //비밀번호
		
		Integer i = libraryMapper.libInsert(dto);
		System.out.println(i + "행이(가) 삽입되었습니다.");
	}
}
