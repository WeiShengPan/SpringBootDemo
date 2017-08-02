package cn.wspan.SpringBootDemo.model;

import java.io.Serializable;

/**
 * @author panws
 * @since 2017-08-02
 */
public class User implements Serializable {
	
	private Long id;
	
	private String username;
	
	private String password;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}