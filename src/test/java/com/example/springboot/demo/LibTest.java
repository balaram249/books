package com.example.springboot.demo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest(classes =DemoApplication.class)
public class LibTest {
	@Autowired
	BookRepository bookrepository;
	@Test
	public void myTest()
	{
		Book b=new Book(10,"boot-camp","bnil");
		bookrepository.save(b);
		List<Book> l=bookrepository.findByAuthor("bnil");
		System.out.println(l.size());
		assertEquals(l.get(0).getId(),8);
	}
}
