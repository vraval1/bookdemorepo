package com.example.bookrepo;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bookId;
	
	private String bookName;
	
	private String isbn;
	
	public Book() {}

	public Book(Long bookId, String bookName, String isbn) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.isbn = isbn;
	}
	
	public Book(String bookName, String isbn) {
		super();
		this.bookName = bookName;
		this.isbn = isbn;
	}
	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookId, bookName, isbn);
	}



	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", isbn=" + isbn
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bookId, other.bookId) && Objects.equals(bookName, other.bookName)
				&& Objects.equals(isbn, other.isbn);
	}
	
	
	
}
