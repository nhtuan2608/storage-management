package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;

import spring.model.User;
import spring.service.GenericService;

public class LoginController {
	@Autowired
	public GenericService<User> userService;
	
	
}
