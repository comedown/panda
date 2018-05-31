package com.young.panda.hello.controller.auth;

import com.young.panda.entity.auth.User;
import com.young.panda.hello.controller.BaseController;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
@RequestMapping("/auth")
public class LoginController extends BaseController {

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
		User user = new User();
		user.setName("aa");
		user.setPassword("");
		return user;
	}
}
