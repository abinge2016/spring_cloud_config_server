package com.abinge.springboot.aoptest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Describe:
 * <p>Created by <a href="mailto:chenbj@yintong.com.com">chenbj</a> at  2017/3/31 21:05.
 *
 * @Author: chenbj
 * @Version: $Id$
 * @Since: 1.0.0-SNAPSHOT
 * @Company: www.lianlianpay.com
 */
@Configuration
@ComponentScan("com.abinge.springboot.aoptest")
@EnableAspectJAutoProxy
public class AopConfig {

}
