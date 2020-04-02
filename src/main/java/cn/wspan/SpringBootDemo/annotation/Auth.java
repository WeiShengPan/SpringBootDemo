/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package cn.wspan.SpringBootDemo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author weisheng.pws
 * @version $Id: Auth.java, v 0.1 2020年04月02日 11:10 AM weisheng.pws Exp $
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Auth {

    AuthType type();

    enum AuthType {
        READ,
        WRITE
    }
}