package com.sql.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Book;
import com.mysql.repository.Bookrepository;

@RestController
public class BookController {
     Bookrepository bookrepository;
	@PostMapping("/booksave")
	public String insertBook(@RequestBody Book book) {
		bookrepository.save(book);
	return "your record is saved succesfully";
	
}
	@PostMapping("/multiplebooksave")
	public String insertBook(@RequestBody List<Book> book) {
		bookrepository.saveAll(book);
	return " record  saved succesfully";
	
}
	@GetMapping("/getAllsave")
	public List<Book> getBook(@PathVariable("name") String bookname){
		return (List<Book>) bookrepository.findbybookname(bookname);
}
	@GetMapping("/getByBookId/{bookId}")
	public Optional<Book> getBook(@PathVariable("bookId") Long id){
		return bookrepository.findById(id);
	}

	
	
}