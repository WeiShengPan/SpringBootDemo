/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package cn.wspan.SpringBootDemo.aspect;

import cn.wspan.SpringBootDemo.annotation.Auth;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Custom auth aspect
 *
 * @author weisheng.pws
 * @version $Id: AuthAspect.java, v 0.1 2020年04月02日 11:08 AM weisheng.pws Exp $
 */
@Component
@Aspect
public class AuthAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthAspect.class);

    /**
     * pointcut for all target annotated by Auth
     */
    @Pointcut("@annotation(cn.wspan.SpringBootDemo.annotation.Auth)")
    public void authPoint() {}

    /**
     * Around auth
     *
     * @param joinPoint The proceeding join point
     * @param auth      The annotation obj that annotated in target
     * @return
     */
    @Around(value = "authPoint()&&@annotation(auth)")
    public Object aroundAuth(ProceedingJoinPoint joinPoint, Auth auth) {
        Object obj = null;

        try {
            LOGGER.info("AuthAspect aroundAuth before");
            obj = joinPoint.proceed();
            LOGGER.info("AuthAspect aroundAuth after");
        } catch (Throwable throwable) {
            LOGGER.error("AuthAspect aroundAuth error.", throwable);
        }

        return obj;
    }

}