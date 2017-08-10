package cn.wspan.SpringBootDemo.controller;

import cn.wspan.SpringBootDemo.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panws
 * @since 2017-08-08
 */
@RestController
@RequestMapping("/mail/")
public class MailController {
	
	@Autowired
	private MailService mailService;
	
	@RequestMapping(value = "send-simple", method = RequestMethod.GET)
	public void sendSimple(String to, String sub, String ctx) {
		mailService.sendSimple(to, sub, ctx);
	}
	
	@RequestMapping(value = "send-html", method = RequestMethod.GET)
	public void sendHtml(String to, String sub, String ctx) {
		mailService.sendHtml(to, sub, ctx);
	}
}
