package springBootTest2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springBootTest2.command.MemberCommand;
import springBootTest2.service.member.MemberDeleteService;
import springBootTest2.service.member.MemberDetailService;
import springBootTest2.service.member.MemberListService;
import springBootTest2.service.member.MemberModiService;
import springBootTest2.service.member.MemberNumService;
import springBootTest2.service.member.MemberWriteService;

@Controller
@RequestMapping("mem") //관리자 페이지
public class MemberController {
	@Autowired
	MemberListService memberListService;
	@Autowired
	MemberDetailService memberDetailService;
	@Autowired
	MemberDeleteService memberDeleteService;
	@Autowired
	MemberWriteService memberWriteService;
	@Autowired
	MemberModiService memberModiService;
	@Autowired
	MemberNumService memberNumService;
	
	@RequestMapping("memberList")
	public String memberList(Model model) {
		memberListService.execute(model);
		return "thymeleaf/member/memberList";
	}
	@RequestMapping("memberRegist")
	public String memberRegist(Model model) {
		String memNum = memberNumService.execute();
		model.addAttribute("memNum", memNum);
		return "thymeleaf/member/memberForm";
	}
	@RequestMapping("memberWrite")
	public String memberHome(MemberCommand memberCommand) {
		memberWriteService.execute(memberCommand);
		return "redirect:memberList";
	}
	@RequestMapping("memberDetail")
	public String memberUpdate(@RequestParam(value="num") String memNum, Model model) {
		memberDetailService.execute(memNum, model);
		return "thymeleaf/member/memberDetail";
	}
	@RequestMapping("memberDelete")
	public String memberDelete(@RequestParam(value="num") String memNum) {
		memberDeleteService.execute(memNum);
		return "redirect:memberList";
	}
	@RequestMapping("memberModify")
	public String memberModify(@RequestParam(value = "num") String memNum, Model model) {
		memberDetailService.execute(memNum, model);
		return "thymeleaf/member/memberUpdate";
	}
	@RequestMapping("memberUpdate")
	public String memberModify(MemberCommand memberCommand) {
		memberModiService.execute(memberCommand);
		return "redirect:memberDetail?num="+memberCommand.getMemNum();
	}
}
