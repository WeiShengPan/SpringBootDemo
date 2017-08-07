package cn.wspan.SpringBootDemo.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Session配置类
 * 
 * @author panws
 * @since 2017-08-03
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 120)
//配置缓存时间为120s
public class SessionConfig {
	
}
