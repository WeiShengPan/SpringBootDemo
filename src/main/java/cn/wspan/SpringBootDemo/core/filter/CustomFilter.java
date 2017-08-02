package cn.wspan.SpringBootDemo.core.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 自定义filter
 * 
 * @author panws
 * @since 2017-08-02
 */
public class CustomFilter implements Filter {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomFilter.class);
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}
	
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
		logger.info("Request to url: [{}]", httpServletRequest.getRequestURL());
		filterChain.doFilter(servletRequest, servletResponse);
	}
	
	@Override
	public void destroy() {
		
	}
}
