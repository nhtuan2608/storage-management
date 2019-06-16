package spring.controller.rest_api;

import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import spring.model.User;
import spring.service.GenericService;

@RestController
@RequestMapping("/api/")
public class UserApi {
	
	@Autowired
    private GenericService<User> userService;
	
//	@GetMapping("/users")
//	public @ResponseBody User[] getUser() {
//		User[] users = new User[] { new User("MH14","Tuan","123456","Admin"), new User("MH13","Dung","123456","user")};
//		return users;
//	}
	
	 @GetMapping(value = "/user")
	    public ResponseEntity<List<User>> listAllUsers() {
	        List<User> users = userService.findAll();
	        if(users.isEmpty()){
	            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
	        }
	        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
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
    public String saveUser(@ModelAttribute("user") @Valid User entity,
                            BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("listUsers", userService.findAll());
            return "newUser";
        }
        userService.save(entity);
        return "redirect:showUser";
    }
	
	@RequestMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable String id, Model model) {
		userService.delete(id);
		model.addAttribute("listUsers", userService.findAll());
		return "showUser";
	}
}
