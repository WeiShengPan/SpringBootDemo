package cn.wspan.SpringBootDemo.helper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 *
 * @author panws
 * @since 2017-08-02
 */
@Component
@PropertySource("classpath:myapp.properties")
public class PropertiesConfig {
	
	@Value("${demo.application.name}")
	private String appName;
	
	@Value("${demo.application.desc}")
	private String appDesc;
	
	@Value("${demo.application.owner}")
	private String appOwner;
	
	@Value("${myapp.country}")
	private String appCountry; //注入自定义配置文件中的属性
	
	public String getAppName() {
		return appName;
	}
	
	public void setAppName(String appName) {
		this.appName = appName;
	}
	
	public String getAppDesc() {
		return appDesc;
	}
	
	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}
	
	public String getAppOwner() {
		return appOwner;
	}
	
	public void setAppOwner(String appOwner) {
		this.appOwner = appOwner;
	}
	
	public String getAppCountry() {
		return appCountry;
	}
	
	public void setAppCountry(String appCountry) {
		this.appCountry = appCountry;
	}
}
