package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class indexController {
	@GetMapping("/")
	public String showHomePage() {
		return "index";
	}
	
	@RequestMapping("/redirect")
	public String redirectHomePage() {
		return "index";
	}
}
