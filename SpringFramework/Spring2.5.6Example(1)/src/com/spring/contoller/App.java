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

/*http://www.mkyong.com/spring/quick-start-maven-spring-example/
 * Maven + Spring 2.5.6 hello world example.
*/
 