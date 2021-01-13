package com.example.demo.model;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class BookTest {
    @Test
    public void test(){
        Book book = new Book();
        System.out.println("test....");
        System.out.println(book.getId());
        System.out.println(book.author);
    }

}