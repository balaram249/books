package com.example.springboot.demo;
import com.example.springboot.demo.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class LibService {
@Autowired
private BookService bookservice;
public String getBook()
{return bookservice.getBookName();}
}
