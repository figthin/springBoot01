package com.hwua;

import com.hwua.entities.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot01ApplicationTest {

    @Autowired
    private Book book2;

    @Test
    public void test(){
        System.out.println("book = " + book2);
    }
}
