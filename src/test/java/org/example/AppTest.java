package org.example;

import man.kuke.pojo.Books;
import man.kuke.service.BookService;
import man.kuke.service.BookServiceImp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImp = (BookService) context.getBean("BookServiceImp");
        List<Books> books = bookServiceImp.queryBooks();
        for (Books book : books) {
            System.out.println(book);
        }
    }
}
