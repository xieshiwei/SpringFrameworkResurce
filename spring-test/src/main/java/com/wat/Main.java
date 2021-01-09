package com.wat;

import com.wat.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Main
 * @Author 萌琪琪爸爸
 * @Description //TODO
 * @Date 2021/1/9 17:29
 **/
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		AppConfig appConfig = annotationConfigApplicationContext.getBean(AppConfig.class);
		appConfig.test("hello spring!");
	}
}
