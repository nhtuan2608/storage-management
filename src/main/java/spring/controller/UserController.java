package spring.controller;

import java.util.ArrayList;
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

//import spring.model.Role;
import spring.model.User;
import spring.service.GenericService;

@Controller
public class UserController {

	@Autowired
	private GenericService<User> userService;

//	@Autowired
//	private GenericService<Role> roleService;

	@GetMapping("/addUser")
	public String newUser(Model model) {
		contructorModel(model);
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
	public String saveUser(@ModelAttribute("user") @Valid User user, BindingResult result, Model model) {
		System.out.println("user: " + user);
//		System.out.println("role: " + user.getRole().getName());
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		if (result.hasErrors()) {
			contructorModel(model);
			System.out.println("Model: " + model);
			System.out.println("Error saving: " + result.getAllErrors());
			return "addUser";
		}
//		if(userService.findByName(user.getUsername()))
//		{
//			System.out.println("User " + user.getUsername() + " exists.");
//			model.addAttribute("userExisted", user);
//			contructorModel(model);
//			System.out.println("Model: " + model);
//			return "addUser";
//		}
		System.out.println();
//		user.setRole(roleService.returnUserFindByName(user.getRole().getName()));
		System.out.println("save User: " + user);
//		System.out.println("to the save service");
		userService.save(user);
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

//	public Map<String,String> getList_Supplier(){
//		List<Role> roles = roleService.findAll();
//		Map <Integer,String> dropBoxData = new LinkedHashMap<Integer,String>();
//		for(Supplier obj : list)
//		{
//			dropBoxData.put(obj.getId(), obj.getName());
//		}
//		return dropBoxData;
//	}

	public Model contructorModel(Model model) {
		List<User> listUsers = userService.findAll();
//		List<Role> roles = roleService.findAll();
//		LinkedHashMap<Integer, String> listRoles = new LinkedHashMap<Integer, String>();
//		for(Role role: roles) {
//			listRoles.put(Integer.valueOf(role.getId()), role.getName());
//		}
//		System.out.println(listRoles);
		List<String> roleNames = new ArrayList<>();
//		for(Role role: roles) {
//			roleNames.add(role.getName());
//		}
		int length = listUsers.size();
		int id;
		if (length == 0 || listUsers == null) {
			id = 1;
			User user = new User();
//			Role role = new Role(1, "user");
//			user.setRole(role);
			user.setId("UID" + id);
			model.addAttribute("user", user);
			model.addAttribute("roles", roleNames);
			System.out.println(model);
		} else {
			id = (length + 1);
			User user = new User();
			user.setId("UID" + id);
			model.addAttribute("user", user);
			model.addAttribute("roles", roleNames);
			System.out.println(model);
		}
		return model;
	}
}
