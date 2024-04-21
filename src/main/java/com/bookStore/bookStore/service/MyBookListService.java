package com.bookStore.bookStore.service;

import com.bookStore.bookStore.entity.MyBookList;
import com.bookStore.bookStore.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookListService {

    @Autowired
    MyBookRepository myBookRepository;

    public void saveMyBook(MyBookList book){
        myBookRepository.save(book);
    }

    public List<MyBookList> getAllMyBooks(){
        return myBookRepository.findAll();
    }
}
