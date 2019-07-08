package spring.controller;

import java.security.Principal;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
//	@GetMapping("/")
//	public String showHomePage() {
//		return "index";
//	}

	@GetMapping("/")
	public String welcomePage(Model model) {
		model.addAttribute("title", "Welcome");
		String encoded=new BCryptPasswordEncoder().encode("admin");
		System.out.println(encoded);
//		model.addAttribute("message", "You are logged in as " + principal.getName());
		return "index";
	}

	@GetMapping(value = "/admin")
	public String adminPage(Model model) {
		return "admin";
	}

	@GetMapping(value = "/login")
	public String loginPage(Model model) {
		return "login";
	}

	@GetMapping(value = "/logoutSuccessful")
	public String logoutSuccessfulPage(Model model) {
		model.addAttribute("title", "Logout");
		return "logoutSuccessfulPage";
	}

	@GetMapping(value = "/userInfo")
	public String userInfo(Model model, Principal principal) {

		// Sau khi user login thanh cong se co principal
		String userName = principal.getName();

		System.out.println("User Name: " + userName);

		return "userInfoPage";
	}

	@GetMapping(value = "/403")
	public String accessDenied(Model model, Principal principal) {

		if (principal != null) {
			model.addAttribute("message",
					"Hi " + principal.getName() + "<br> You do not have permission to access this page!");
		} else {
			model.addAttribute("msg", "You do not have permission to access this page!");
		}
		return "403Page";
	}
}
