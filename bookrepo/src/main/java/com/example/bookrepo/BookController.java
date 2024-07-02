package com.example.bookrepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/books")
public class BookController {

	@Autowired
	private BookRepository bookRepo;


	@PostMapping(path = "/addbook")
	public @ResponseBody String addBook(@RequestBody Book newBook) {

		bookRepo.save(newBook);

		return "Book saved successfully";
	}

	@GetMapping(path = "/getallbooks")
	public @ResponseBody List<Book> getAllBooks() {
		return bookRepo.findAll();
	}
}
