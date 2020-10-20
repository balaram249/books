package com.example.springboot.demo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface BookRepository extends JpaRepository <Book, Integer>
{
	//@Query(value="SELECT * FROM Book  WHERE author = ?1 ",nativeQuery=true)
	List<Book> findByAuthor(String txt);

}
