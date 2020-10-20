package com.example.springboot.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@Autowired
	BookRepository bookrepository;
@GetMapping("/books")
public List<Book> getAllBooks()
{
	return bookrepository.findAll();
}
@GetMapping("/books/author")

public ResponseEntity<List<Book>> getAllBooksWithName(@RequestParam String author)
{
	System.out.println(author);
	return new ResponseEntity(bookrepository.findByAuthor(author),HttpStatus.OK);
}
@PostMapping(path="/addbook",produces = "application/json", consumes = "application/x-www-form-urlencoded")

public String addBook(@RequestParam String author,@RequestParam String name)
{
	Book book=new Book(5,author,name);
	bookrepository.save(book);
	return ("the author of the book is "+book.getAuthor());
}
@DeleteMapping("/books")
public void deleteByAuthor(@RequestParam String author) throws BookDoesNotExistException
{
	List<Book> b=bookrepository.findByAuthor(author);
	if (b.isEmpty()) throw new BookDoesNotExistException("given author" +author+" has no book");
	else {
	for(int i=0;i<b.size();i++)
	{
		bookrepository.deleteById(b.get(i).getId()); 
	}}
}
@PutMapping("/books")
public List<Book> updateBook(@RequestParam String author, @RequestParam String updatename)
{
	List<Book> b=bookrepository.findByAuthor(author);
	for(int i=0;i<b.size();i++)
	{
		b.get(i).setAuthor(author);
		b.get(i).setName(updatename);
	}
	return b;
}
}
