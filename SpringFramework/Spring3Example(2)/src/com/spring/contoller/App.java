package com.spring.contoller;


import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

import com.spring.bean.HelloWorld;

public class App {
	public static void main(String[] args) {
		
		Resource resource=new ClassPathResource("Spring-Module.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      

		HelloWorld obj = (HelloWorld) factory.getBean("helloBean");
		obj.printHello();
	}	
}

 
/*If you aren't using maven (or any other dependency management tool, for that matter),
 * you should add spring-context dependencies manually,
 * which are spring-beans, spring-core, spring-aop and spring-expression,
 * of course each of them have their own dependencies either (Transitive Dependency).
 * By the way, BeansException is part of spring-beans module
 * 
 * http://www.mkyong.com/spring3/spring-3-hello-world-example/
*/

 