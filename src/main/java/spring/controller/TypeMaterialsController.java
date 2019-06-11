package spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring.model.User;

@Controller
public class TypeMaterialsController {
	//call to index.jsp
		@RequestMapping("/")
		public String showHomePage() {
			return "index";
		}
		
		@RequestMapping("/new")
		public String newUser() {
			return "newUser";
		}
		
		@RequestMapping("/showUser")
		public String showUser() {
			return "showUser";
		}
		
		@RequestMapping(value="/saveUser", method=RequestMethod.POST)
		public String saveUser(Model model,HttpServletRequest rq, 
				@RequestParam("userNo") String usrNo, 
				@RequestParam("userName") String usrName,
				@RequestParam("userRole") String usrRole) {
//			String usrNo = rq.getParameter("userNo");
//			String usrName = rq.getParameter("userName");
//			String usrRole = rq.getParameter("userRole");
			
//			model.addAttribute("userNo",usrNo);
//			model.addAttribute("userName",usrName);
//			model.addAttribute("userRole",usrRole);
			
			User usr = new User();
			usr.setUserNo((Integer.parseInt(usrNo)));
			usr.setUserName((usrName));
			usr.setUserRole((usrRole));
			
			model.addAttribute("user",usr);
			return "showUser";
		}
}
