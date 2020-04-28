package com.demo.processor;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class BeanPostProcessor1 implements BeanPostProcessor, Ordered{
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		System.out.println(this.getClass().getSimpleName()+"\t"+new Object() {}.getClass().getEnclosingMethod().getName());
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) {
		System.out.println(this.getClass().getSimpleName()+"\t"+new Object() {}.getClass().getEnclosingMethod().getName());
		return bean;
	}

	@Override
	public int getOrder() {
		return 1;
	}

}
