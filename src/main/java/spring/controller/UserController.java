package spring.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javassist.expr.NewArray;
import spring.model.Role;
//import spring.model.Role;
import spring.model.User;
import spring.service.GenericService;

@Controller
public class UserController {

	@Autowired
	private GenericService<User> userService;

	@Autowired
	private GenericService<Role> roleService;

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
	
	@GetMapping("/profileUser")
	public String profileUser(Model model, Authentication authentication) {
		String userName = authentication.getName();
		User user = userService.returnUserFindByName(userName);
		model.addAttribute("profileUser", user);
		return "profileUser";
	}

	@RequestMapping("/editUser/{id}")
	public String editUser(@PathVariable String id, Model model) {
		User user = userService.findById(id);
		List<Role> roles = roleService.findAll();
		List<String> listRole = contructorListRoles(roles);
		List<String> sortedList = new ArrayList<String>();
		Iterator<String> iterator = listRole.iterator();
		while (iterator.hasNext()) {
		    String role = iterator.next();
		    if (role.equals(user.getRole().getName())) {
		    	sortedList.add(role);
		        iterator.remove();
		        sortedList.addAll(listRole);
		    }
		}
		model.addAttribute("roleList", sortedList);
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
		String encoded=new BCryptPasswordEncoder().encode(user.getPassword());
		System.out.println(encoded);
		user.setPassword(encoded);
//		if(userService.findByName(user.getUsername()))
//		{
//			System.out.println("User " + user.getUsername() + " exists.");
//			model.addAttribute("userExisted", user);
//			contructorModel(model);
//			System.out.println("Model: " + model);
//			return "addUser";
//		}
		System.out.println();
		user.setRole(roleService.returnUserFindByName(user.getRole().getName()));
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
		String pwd;
		int length = listUsers.size();
		int count = 1;
		for (User obj : listUsers) {
			if (count <= length) {
				pwd = obj.getPassword();
				pwd = pwd.substring(0, 25);
				pwd = pwd.replace("$", "#");
				obj.setPassword(pwd);
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
		List<Role> roles = roleService.findAll();
		List<String> roleNames = contructorListRoles(roles);
		int length = listUsers.size();
		int id;
		if (length == 0 || listUsers == null) {
			id = 1;
			User user = new User();
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
	
	public List<String> contructorListRoles(List<Role> roles){
		List<String> roleNames = new ArrayList<>();
		for(Role role: roles) {
			roleNames.add(role.getName());
		}
		return roleNames;
	}
}
