package com.mysql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Book;


public interface Bookrepository extends JpaRepository<Book,Long> {

	List<Book> findbybookname(String bookname);

	

}
