package com.wat.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName AppConfig
 * @Author 萌琪琪爸爸
 * @Description //TODO
 * @Date 2021/1/9 17:30
 **/
@Configuration
@ComponentScan("com.wat")
public class AppConfig {
	public void test(String msg) {
		System.out.println("msg:" + msg);
	}
}
