package springBootTest2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springBootTest2.command.LibCommand;
import springBootTest2.service.library.LibInfoService;
import springBootTest2.service.library.LibListService;
import springBootTest2.service.library.LibWriteService;

@Controller
@RequestMapping("lib")
public class LibraryController {
	@Autowired
	LibWriteService libWriteService;
	@Autowired
	LibListService libListService;
	@Autowired
	LibInfoService libInfoService;
	
	@RequestMapping("libForm")
	public String libForm() {
		return "thymeleaf/lib/libForm";
	}
	@RequestMapping("libList")
	public String libList(Model model) {
		libListService.execute(model);
		return "thymeleaf/lib/libList";
	}
	@RequestMapping("libWrite")
	public String libWrite(LibCommand libCommand, HttpServletRequest request) {
		libWriteService.execute(libCommand, request);
		return "redirect:libList";
	}
	@RequestMapping("libraryDetail")
	public String libraryDetail(@RequestParam(value="num") String libNum, Model model) {
		libInfoService.execute(libNum, model);
		return "thymeleaf/lib/libInfo";
	}
}
