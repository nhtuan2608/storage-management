package spring.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import spring.model.User;
import spring.service.UserService;

@Controller
public class UserController {
	
	@Autowired
    private UserService userService;
	
	//call to index.jsp
	@GetMapping("/")
	public String showHomePage() {
		return "index";
	}
	
	@GetMapping("/new")
	public String newUser() {
		return "newUser";
	}
	
	@GetMapping("/showUser")
	public String showUser(Locale locale,Model model) {
		model.addAttribute("users", userService.list());
		return "showUser";
	}
	
	@PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("User") @Valid User user,
                            BindingResult result, Model model) {
 
        if (result.hasErrors()) {
            model.addAttribute("users", userService.list());
            return "newUser";
        }
 
        userService.save(user);
        return "redirect:showUser";
    }
	
//	@PostMapping("/saveUser")
//	public String saveUser(Model model,HttpServletRequest rq, 
//			@RequestParam("userNo") String usrNo, 
//			@RequestParam("userName") String usrName,
//			@RequestParam("userRole") String usrRole) {
////		String usrNo = rq.getParameter("userNo");
////		String usrName = rq.getParameter("userName");
////		String usrRole = rq.getParameter("userRole");
//		
////		model.addAttribute("userNo",usrNo);
////		model.addAttribute("userName",usrName);
////		model.addAttribute("userRole",usrRole);
//		
//		User usr = new User();
//		usr.setId(((usrNo)));
//		usr.setUserName((usrName));
//		usr.setRole((usrRole));
//		
//		model.addAttribute("user",usr);
//		return "showUser";
//	}
	

}
