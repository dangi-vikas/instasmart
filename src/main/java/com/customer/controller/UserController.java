package com.customer.controller;

import com.customer.domain.User;
import com.customer.exception.NotFoundException;
import com.customer.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	LoginService loginService;

	@PostMapping("/userCheck")
	public User userLogin(@RequestBody User user, Exception NotFoundException) throws NotFoundException {
		return loginService.userLogin(user);	
	}
}