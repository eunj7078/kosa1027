package springBootTest2.service.qna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootTest2.domain.QnADTO;
import springBootTest2.mapper.QnAMapper;

@Component
@Service
public class QnaModifyService {
	@Autowired
	QnAMapper qnaMapper;
	public void execute(Integer qnaNum, Model model) {
		QnADTO dto = qnaMapper.selectOne(qnaNum);
		model.addAttribute("dto", dto);
	}
}
