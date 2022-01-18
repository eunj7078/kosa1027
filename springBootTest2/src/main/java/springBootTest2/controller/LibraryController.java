package springBootTest2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import springBootTest2.command.LibCommand;
import springBootTest2.service.LibWriteService;

@Controller
@RequestMapping("lib")
public class LibraryController {
	@Autowired
	LibWriteService libWriteService;
	
	@RequestMapping("libForm")
	public String libForm() {
		return "thymeleaf/lib/libForm";
	}
	@RequestMapping("libList")
	public String libList() {
		return "thymeleaf/lib/libList";
	}
	@RequestMapping("libWrite")
	public String libWrite(LibCommand libCommand, HttpServletRequest request) {
		libWriteService.execute(libCommand, request);
		return "redirect:libList";
	}
	
}
