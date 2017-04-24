package com.abinge.springboot.aoptest;

import java.lang.annotation.*;

/**
 * Describe:
 * <p>Created by <a href="mailto:chenbj@yintong.com.com">chenbj</a> at  2017/3/31 21:10.
 *
 * @Author: chenbj
 * @Version: $Id$
 * @Since: 1.0.0-SNAPSHOT
 * @Company: www.lianlianpay.com
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
