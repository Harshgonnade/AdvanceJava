package com.cdac.training.springhibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.training.springhibernate.model.Book;

// DAO layer connects with DB using HibernateTemplate to perform DB Operations
//HibernateTemplate is configured in Spring config file
@Repository
@Transactional
public class BookDAO {
	
	// DI using Field
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void saveBook(Book book) {
        hibernateTemplate.save(book); //save() is predefined method of HibernateTemplate
    }

    public List<Book> getAllBooks() {
        return hibernateTemplate.loadAll(Book.class);
    }

	
}
