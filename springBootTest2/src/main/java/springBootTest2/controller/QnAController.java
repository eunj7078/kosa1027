package springBootTest2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springBootTest2.command.QnACommand;
import springBootTest2.service.qna.QnaDelService;
import springBootTest2.service.qna.QnaInfoService;
import springBootTest2.service.qna.QnaListService;
import springBootTest2.service.qna.QnaModifyService;
import springBootTest2.service.qna.QnaUpdateService;
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
	@Autowired
	QnaDelService qnaDelService;
	@Autowired
	QnaModifyService qnaModifyService;
	@Autowired
	QnaUpdateService qnaUpdateService;
	
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
	@RequestMapping(value = "qnaDetail", method = RequestMethod.GET)
	public String qnaInfo(@RequestParam(value = "num") Integer qnaNum, Model model) {
		qnaInfoService.execute(qnaNum, model);
		return "thymeleaf/qna/qnaDetail";
	}
	@RequestMapping("qnaDelete")
	public String qnaDelete(@RequestParam(value = "num") Integer qnaNum) {
		qnaDelService.execute(qnaNum);
		return "redirect:qnaList";
	}
	@RequestMapping("qnaModify")
	public String qnaModify(@RequestParam(value = "num") Integer qnaNum, Model model) {
		qnaModifyService.execute(qnaNum, model);
		return "thymeleaf/qna/qnaUpdate";
	}
	@RequestMapping("qnaUpdate")
	public String qnaUpdate(QnACommand qnaCommand) {
		qnaUpdateService.execute(qnaCommand);
		return "redirect:qnaDetail?num="+qnaCommand.getQnaNum();
	}
}
