package com.example.springboot.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

public class Book
{
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Id
	    private int id;
	private String author;
	private String name;
	public Book() {}
	public Book(int id,String name,String author)
	{
		this.setAuthor(author);
		this.setId(id);
		this.setName(name);
	}
	public Book(String name,String author)
	{
		this.setAuthor(author);
		//this.setId(id);
		this.setName(name);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "BookEntity [id=" + id + ", author=" + author + ", name=" + name + "]";
	}
}
