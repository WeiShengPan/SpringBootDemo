package cn.wspan.SpringBootDemo.helper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
*
 * @author panws
 * @since 2017-08-02
 */
@Component
public class PropertiesConfig {
	
	@Value("${demo.application.name}")
	private String appName;
	
	@Value("${demo.application.desc}")
	private String appDesc;
	
	@Value("${demo.application.owner}")
	private String appOwner;
	
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
}
