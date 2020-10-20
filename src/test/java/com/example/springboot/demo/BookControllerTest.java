package com.example.springboot.demo;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
@RunWith(MockitoJUnitRunner.class)
class BookControllerTest {
	private MockMvc mockMvc;
@InjectMocks
BookController bookcontroller;
@Mock
BookRepository bookrepository;
@Before
public void initMocks(){
    MockitoAnnotations.initMocks(this);
    this.mockMvc = MockMvcBuilders.standaloneSetup(new BookController()).build();
    
}
	@Test
	void test() 
	{
		Mockito.when(bookrepository.findAll()).thenReturn(new ArrayList<Book>());
		//assertEquals(expected, actual);
		// when(bookrepository.findAll()).thenReturn([{"id":1,"name":"ballu","author":"learn java"}]);
	}

}
