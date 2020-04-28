package com.demo.main;

import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.demo.model.Message;

public class BeanFactoryDemo {

	public static void main(String[] args) {

		Resource res = new ClassPathResource("Bean.xml");
		BeanFactory bf = new XmlBeanFactory(res);
		Object object = bf.getBean("message");
		if (object != null) {
			Message message = (Message) object;
			System.out.println(message.getMessageId() + "\t" + message.getMsg());
		}

		System.out.println("-------------------------------------------------");

		Message message1 = bf.getBean("message", Message.class);
		if (message1 != null) {
			System.out.println(message1.getMessageId() + "\t" + message1.getMsg());
		}

		System.out.println("-------------------------------------------------");

		String[] aliases = bf.getAliases("message");
		Arrays.asList(aliases).forEach(x -> System.out.println(x));

		System.out.println("-------------------------------------------------");

		// Make sure there is only one bean is defined with Message type
		Message message2 = bf.getBean(Message.class);
		if (message2 != null) {
			System.out.println(message2.getMessageId() + "\t" + message2.getMsg());
		}

		System.out.println("-------------------------------------------------");

		// Make sure there is only one bean is defined with Message type
		Class<?> cls = bf.getType("message");
		if (cls != null) {
			System.out.println(cls.getName());
		}

		System.out.println("-------------------------------------------------");
		System.out.println(bf.isSingleton("message"));

	}

}
