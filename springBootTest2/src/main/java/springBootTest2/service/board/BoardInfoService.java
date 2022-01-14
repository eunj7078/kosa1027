package springBootTest2.service.board;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootTest2.domain.BoardDTO;
import springBootTest2.mapper.BoardMapper;

@Component
@Service
public class BoardInfoService {
	@Autowired
	BoardMapper boardMapper;
//	public void execute(String boardNum, Model model) {
//		
//		BoardDTO dto = boardMapper.selectOne(Integer.parseInt(boardNum));
//		model.addAttribute("dto", dto);
	public void execute(HttpServletRequest request ) {
		Integer num = Integer.parseInt(request.getParameter("num"));
		BoardDTO dto = boardMapper.selectOne(num); // BoardDTO dto =  dto;
		request.setAttribute("dto", dto);
	}
}
