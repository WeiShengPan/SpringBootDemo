package cn.wspan.SpringBootDemo.core;

import cn.wspan.SpringBootDemo.core.filter.CustomFilter;
import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 * 
 * @author panws
 * @since 2017-08-02
 */
@Configuration
public class AppConfig {
	
	@Bean
	public RemoteIpFilter remoteIpFilter() {
		return new RemoteIpFilter();
	}
	
	@Bean
	public FilterRegistrationBean testFilterRegistration() {
		
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new CustomFilter());
		registration.addUrlPatterns("/*");
		registration.addInitParameter("paramName", "paramValue");
		registration.setName("CustomFilter");
		registration.setOrder(1);
		return registration;
	}
}
