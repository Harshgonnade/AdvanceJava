package com.cdac.training.springhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.training.springhibernate.dao.BookDAO;
import com.cdac.training.springhibernate.model.Book;

@Service
@Transactional
public class BookService {
	
	@Autowired
    private BookDAO bookDAO;

    public void saveBook(Book book) {
        bookDAO.saveBook(book);
    }

    public List<Book> getAllBooks() {
        return bookDAO.getAllBooks();
    }

}
