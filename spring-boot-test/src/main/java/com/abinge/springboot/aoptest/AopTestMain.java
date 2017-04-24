package com.abinge.springboot.aoptest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Describe:
 * <p>Created by <a href="mailto:chenbj@yintong.com.com">chenbj</a> at  2017/3/31 21:03.
 *
 * @Author: chenbj
 * @Version: $Id$
 * @Since: 1.0.0-SNAPSHOT
 * @Company: www.lianlianpay.com
 */
public class AopTestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AopConfig.class);
        DemoMethodService methodService = context.getBean(DemoMethodService.class);
        DemoAnnotationService annotationService = context.getBean(DemoAnnotationService.class);
        methodService.add();
        annotationService.add();


        context.close();
    }
}
