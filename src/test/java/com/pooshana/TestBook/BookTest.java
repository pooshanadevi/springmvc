package com.pooshana.TestBook;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pooshana.Configuration.BookConfiguration;
import com.pooshana.Model.Book;

public class BookTest {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(BookConfiguration.class);
		Book book=(Book)context.getBean(Book.class);
		book.setId(1);
		book.setBookName("Dem");
		book.setAuthor("Shila");
		System.out.println(book);
		
		
		
	}
	}


