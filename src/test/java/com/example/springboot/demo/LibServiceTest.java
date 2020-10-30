package com.example.springboot.demo;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LibServiceTest {
	@InjectMocks
	LibService libservice;
	@Mock
	BookService bookservice;
	@Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
	@Test
	public void whenCalledItReturnHoney()
	{
		when(bookservice.getBookName()).thenReturn("Honey");
		String name=libservice.getBook();
		assertEquals(name,"Honey");
	}

}
