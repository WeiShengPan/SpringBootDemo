package cn.wspan.SpringBootDemo.dao;

import cn.wspan.SpringBootDemo.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 使用MyBatis作为数据持久层
 * 
 * @author panws
 * @since 2017-08-02
 */
@Mapper
public interface UserMapper {

	User getById(Long id);
	
	void createUser(User user);
	
	void deleteById(Long id);
	
	List<User> findAll();
}
