package com.abinge.springboot.beantest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Describe:
 * <p>Created by <a href="mailto:chenbj@yintong.com.com">chenbj</a> at  2017/3/31 20:52.
 *
 * @Author: chenbj
 * @Version: $Id$
 * @Since: 1.0.0-SNAPSHOT
 * @Company: www.lianlianpay.com
 */
@Configuration
public class JavaConfig {

    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService(){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }

//    @Bean
//    public UseFunctionService useFunctionService(FunctionService functionService){
//        UseFunctionService useFunctionService = new UseFunctionService();
//        useFunctionService.setFunctionService(functionService);
//        return useFunctionService;
//    }
}
