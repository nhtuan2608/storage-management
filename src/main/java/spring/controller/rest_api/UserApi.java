package spring.controller.rest_api;

import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import spring.model.User;
import spring.service.GenericService;

@RestController
@RequestMapping("/api/users")
public class UserApi {

	@Autowired
	private GenericService<User> userService;

	// -------------------------------- Get All User
	// --------------------------------------------------------------------------------
	@GetMapping("/all")
	public ResponseEntity<List<User>> listAllUsers() {
		List<User> users = userService.findAll();
		if (users.isEmpty()) {
			System.out.println("Found 0 User.");
			return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);// You many decide to return
																			// HttpStatus.NOT_FOUND
		} else {

			return new ResponseEntity<List<User>>(users, HttpStatus.OK);
		}

	}

	// --------------------------------- Get Single User
	// --------------------------------------------------------------------------------
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUser(@PathVariable("id") String id) {
		System.out.println("Fetching User with id " + id);
		User user = userService.findById(id);
		if (user == null) {
			System.out.println("User with id " + id + " not found");
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		} else {
			System.out.println("User with id " + id + " not found");
			return new ResponseEntity<User>(user, HttpStatus.OK);
		}
	}

	// -------------------Create a User
	// ------------------------------------------------------------------------------

	@PostMapping("/addUser/")
	public ResponseEntity<Void> createUser(@RequestBody User user, UriComponentsBuilder ucBuilder) {
		

		if (userService.isExist(user)) {
			System.out.println("A User with name " + user.getUsername() + " already exist");
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}

		userService.save(user);
		System.out.println("Created User " + user.getUsername());
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/add/{id}").buildAndExpand(user.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	// ------------------- Update a User
	// -----------------------------------------------------------------------------------------

	@RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
	public ResponseEntity<User> updateUser(@PathVariable("id") String id, @RequestBody User user) {
		User currentUser = userService.findById(id);

		if (currentUser == null) {
			System.out.println("User with id " + id + " not found");
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}

		currentUser.setUserName(user.getUsername());
		currentUser.setPassword(user.getPassword());

		userService.update(currentUser);
		System.out.println("Updated User " + id);
		return new ResponseEntity<User>(currentUser, HttpStatus.OK);
	}

	// --------------------------------- Delete User
	// ---------------------------------------------------------------------------------
	@GetMapping("/deleteUser/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable String id) {

		User user = userService.findById(id);
		if (user != null) {
			System.out.println("Found User " + id);
			System.out.println("Deleted User with ID = " + id);
			userService.delete(id);
			return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
		} else {
			System.out.println("User with id " + id + " not found");
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/showUser")
	public String showUser(Model model) {
		model.addAttribute("listUsers", userService.findAll());
		return "showUser";
	}

	@RequestMapping("/editUser/{id}")
	public String editUser(@PathVariable String id, Model model) {
		User user = userService.findById(id);
		model.addAttribute("user", user);
		return "editUser";
	}

	@RequestMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") @Valid User entity, BindingResult result, Model model) {
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
