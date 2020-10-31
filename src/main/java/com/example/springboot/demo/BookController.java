package com.example.springboot.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
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
//curl -d "author=sudeep&name=boot-camp" -H "Content-Type: application/x-www-form-urlencoded" -X POST http://localhost:8080/addbook
//>curl -i -X POST -H "Content-Type: application/json" -d "{\"id\": 1,\"author\":\"bbb\",\"name\" : \"bbbbaaaa\"}" http://localhost:8080/addbook
@CrossOrigin(origins="*")
@PostMapping(path="/addbook",produces = "application/json", consumes = "application/json")

public void addBook(@RequestBody Book temp_book)
{
	Book book=new Book(temp_book.getAuthor(),temp_book.getName());
	
	bookrepository.save(book);
	//return ("the author of the book is "+book.getAuthor());
}
@CrossOrigin(origins="*")
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
@CrossOrigin(origins="*")
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
