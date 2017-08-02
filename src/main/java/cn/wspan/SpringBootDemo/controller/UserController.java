package cn.wspan.SpringBootDemo.controller;

import cn.wspan.SpringBootDemo.model.User;
import cn.wspan.SpringBootDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panws
 * @since 2017-08-02
 */
@RestController
@RequestMapping("/user/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "get", method = RequestMethod.GET)
	public User getUser() {
		return userService.getById(1L);
	}
	
	@RequestMapping(value = "create", method = RequestMethod.GET)
	public void createUser() {
		User user = new User();
		user.setUsername("WeishengPan");
		user.setPassword("admin");
		userService.createUser(user);
	}
}
