package com.panda.hello.controller.auth;

import com.panda.system.entity.User;
import com.panda.hello.controller.BaseController;
import com.panda.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;

@RestController
@RequestMapping("/auth")
public class LoginController extends BaseController {
	@Autowired
	private UserService userService;

	@PostMapping("/login")
	private String auth() {
		try {
			System.out.println(ResourceUtils.getURL("classpath").getPath());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return "login";
	}

	@GetMapping("/getUser")
	private User getUser() {
		User user = userService.getUserById(1L);
		return user;
	}

	@PutMapping("/update")
	private String updateUser(User user) {
		System.out.println(request.getMethod());
		return "success";
	}

}
