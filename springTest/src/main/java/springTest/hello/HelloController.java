package springTest.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //문자열로 되어있는 컨트롤러
public class HelloController {
	@RequestMapping("/")
	public String home() {
		return "thymeleaf/test/hello.html";
	}
}
