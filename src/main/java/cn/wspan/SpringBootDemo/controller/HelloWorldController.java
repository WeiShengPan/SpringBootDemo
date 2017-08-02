package cn.wspan.SpringBootDemo.controller;

import cn.wspan.SpringBootDemo.helper.PropertiesConfig;
import cn.wspan.SpringBootDemo.model.App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panws
 * @since 2017-08-02
 */
@RestController
public class HelloWorldController {
	
	@Autowired
	private PropertiesConfig propertiesConfig;
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello() {
		return "Hello world!";
	}
	
	@RequestMapping(value = "/app", method = RequestMethod.GET)
	public App getApp() {
		App app = new App();
		app.setName(propertiesConfig.getAppName());
		app.setDesc(propertiesConfig.getAppDesc());
		app.setOwner(propertiesConfig.getAppOwner());
		app.setCountry(propertiesConfig.getAppCountry());
		return app;
	}
}
