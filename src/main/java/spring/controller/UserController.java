package spring.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.model.User;
import spring.service.GenericService;

@Controller
public class UserController {
	
	@Autowired
    private GenericService<User> userService;
	
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
	public String showUser(Model model) {
		model.addAttribute("listUsers", userService.findAll());
		return "showUser";
	}
	
	@RequestMapping("/editUser/{id}")
	public String editUser(@PathVariable String id, Model model) {
		User user = userService.findById(id);
		model.addAttribute("user",user);
		return "editUser";
	}
	
	@RequestMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") @Valid User user,
                            BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("listUsers", userService.findAll());
            return "newUser";
        }
        userService.save(user);
        return "redirect:showUser";
    }
	
	@RequestMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable String id, Model model) {
		userService.delete(id);
		model.addAttribute("listUsers", userService.findAll());
		return "showUser";
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
