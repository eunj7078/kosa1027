package springBootTest2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springBootTest2.command.QnACommand;
import springBootTest2.service.qna.QnaInfoService;
import springBootTest2.service.qna.QnaListService;
import springBootTest2.service.qna.QnaWriteService;

@Controller
@RequestMapping("qna")
public class QnAController {
	@Autowired
	QnaWriteService qnaWriteService;
	@Autowired
	QnaListService qnaListService;
	@Autowired
	QnaInfoService qnaInfoService;
	
	@RequestMapping(value = "qnaRegist", method = RequestMethod.POST)
	public String qnaRegist(QnACommand qnaCommand, HttpServletRequest request) {
		qnaWriteService.execute(qnaCommand, request);
		return "redirect:qnaList";
	}
	@RequestMapping("qnaWrite")
	public String qnaForm() {
		return "thymeleaf/qna/qnaForm";
	}
	@RequestMapping("qnaList")
	public String qnaHome(Model model) {
		qnaListService.execute(model);
		return "thymeleaf/qna/qnaList";
	}
	@RequestMapping("qnaInfo")
	public String qnaInfo(String qnaNum, Model model) {
		qnaInfoService.execute(qnaNum, model);
		return "thymeleaf/qna/qnaInfo";
	}
}
