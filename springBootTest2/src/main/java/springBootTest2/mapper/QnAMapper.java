package springBootTest2.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import springBootTest2.domain.QnADTO;

@Component
@Repository(value="springBootTest2.mapper.QnAMapper")
public interface QnAMapper {
	public Integer qnaInsert(QnADTO dto);
	public List<QnADTO> selectAll();
	public QnADTO selectOne(String qnaNum);
}
