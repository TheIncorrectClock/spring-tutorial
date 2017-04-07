package com.vogella.spring.first.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vogella.spring.first.di.config.Config;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		ITodo todo = context.getBean(ITodo.class);
		System.out.println(todo);
		context.close();
	}
}
