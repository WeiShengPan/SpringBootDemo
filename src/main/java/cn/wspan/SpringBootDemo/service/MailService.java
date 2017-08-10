package cn.wspan.SpringBootDemo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring4.SpringTemplateEngine;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * spring mail
 * 
 * @author panws
 * @since 2017-08-08
 */
@Service
public class MailService {
	
	private static final Logger logger = LoggerFactory.getLogger(MailService.class);
	
	@Autowired
	private JavaMailSenderImpl javaMailSender;
	@Autowired
	private SpringTemplateEngine springTemplateEngine;
	
	public void sendSimple(String to, String sub, String ctx) {
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom(javaMailSender.getUsername());
		simpleMailMessage.setTo(to);
		simpleMailMessage.setSubject(sub);
		simpleMailMessage.setText(ctx);
		javaMailSender.send(simpleMailMessage);
	}
	
	public void sendHtml(String to, String sub, String ctx) {
		Context context = new Context();
		context.setVariable("sub", sub);
		context.setVariable("ctx", ctx);
		String mailContent = springTemplateEngine.process("mailTemplate", context);
		try {
			MimeMessage mimeMessage = javaMailSender.createMimeMessage();
			MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
			messageHelper.setFrom(javaMailSender.getUsername());
			messageHelper.setTo(to);
			messageHelper.setSubject(sub);
			messageHelper.setText(mailContent, true);
			javaMailSender.send(mimeMessage);
		} catch (MessagingException e) {
			logger.error(e.getMessage(), e);
		}
	}
	
}
