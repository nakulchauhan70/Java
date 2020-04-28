package com.demo.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.model.Book;
import com.demo.model.BookLibrary;

public class ApplicationContextDemo {

	public static void main(String[] args) {

		ApplicationContext appContext = new FileSystemXmlApplicationContext("/config/Bean.xml");

		BookLibrary bookLibrary = appContext.getBean("bookLibrary", BookLibrary.class);

		List<Book> allBook = bookLibrary.getAllBook();
		
		allBook.forEach(book -> System.out.println(book.getBookId()+"\t"+book.getBookName()));

		((AbstractApplicationContext) appContext).close();

	}

}
