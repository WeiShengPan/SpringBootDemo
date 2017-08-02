package cn.wspan.SpringBootDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panws
 * @since 2017-08-02
 */
@RestController
public class HelloWorldController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello() {
		return "Hello world!";
	}
}
