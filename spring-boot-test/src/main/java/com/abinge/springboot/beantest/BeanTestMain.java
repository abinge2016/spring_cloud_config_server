package com.abinge.springboot.beantest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Describe:
 * <p>Created by <a href="mailto:chenbj@yintong.com.com">chenbj</a> at  2017/3/31 20:59.
 *
 * @Author: chenbj
 * @Version: $Id$
 * @Since: 1.0.0-SNAPSHOT
 * @Company: www.lianlianpay.com
 */
public class BeanTestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.sayHello("java config"));

        context.close();
    }
}
