package com.kh.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.kh.domain.User;
import com.kh.service.UserService;

import java.util.List;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("user/list")
	public void userList(Model model) {
		List<User> userList = userService.findAll();
		model.addAttribute("userlist", userList);
	}
	
	@RequestMapping("user/add")
	public void userAdd() {
		
	}
	
	@RequestMapping(value="/user/add", method=RequestMethod.POST)
	public String carAddSubmit(@ModelAttribute User user) {
		userService.add(user);
		return "redirect:/user/list";
	}
}
