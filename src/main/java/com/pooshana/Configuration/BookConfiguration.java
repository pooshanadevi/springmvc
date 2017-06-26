package com.pooshana.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pooshana.Model.Book;

@Configuration
public class BookConfiguration {
	@Bean
	public Book book(){
		return new Book();
	}

}
