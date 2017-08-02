package cn.wspan.SpringBootDemo.service;

import cn.wspan.SpringBootDemo.dao.UserMapper;
import cn.wspan.SpringBootDemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author panws
 * @since 2017-08-02
 */
@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public User getById(Long id) {
		return userMapper.getById(id);
	}
	
	public void createUser(User user) {
		userMapper.createUser(user);
	}
}
