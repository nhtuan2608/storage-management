package spring.controller;

import java.util.List;
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
	
	@GetMapping("/addUser")
	public String newUser(Model model) {
		model.addAttribute("user", new User());
		return "addUser";
	}

	@GetMapping("/showUser")
	public String showUser(Model model) {
		model.addAttribute("listUsers", getList());
		return "showUser";
	}

	@RequestMapping("/editUser/{id}")
	public String editUser(@PathVariable String id, Model model) {
		User user = userService.findById(id);
		model.addAttribute("user", user);
		return "editUser";
	}

	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") @Valid User entity, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("Error saving: " + result.getAllErrors());
			return "editUser";
		}
		System.out.println("save User: " + entity);
		System.out.println("to the save service");
		userService.save(entity);
		return "redirect:/showUser";

	}

	@RequestMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable String id, Model model) {
		userService.delete(id);
		return "redirect:/showUser";
	}

	public List<User> getList() {
		List<User> listUsers = userService.findAll();
		int length = listUsers.size();
		int count = 1;
		for (User obj : listUsers) {
			if (count <= length) {
				obj.setNumberOfObject(count);
				count++;
			}
		}
		return listUsers;
	}
}
