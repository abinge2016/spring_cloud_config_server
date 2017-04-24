package com.abinge.springboot.aoptest;

import org.springframework.stereotype.Service;

/**
 * Describe:
 * <p>Created by <a href="mailto:chenbj@yintong.com.com">chenbj</a> at  2017/3/31 21:13.
 *
 * @Author: chenbj
 * @Version: $Id$
 * @Since: 1.0.0-SNAPSHOT
 * @Company: www.lianlianpay.com
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add方法")
    public void add(){}
}
