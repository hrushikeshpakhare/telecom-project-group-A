package com.example.RestController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examle.model.User;
import com.example.service.UserService;
@RestController
public class UserRestController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	public User save(@RequestBody User user) {
	User users = userService.saveUserdetails(user);
		return users;
		
	}
}
