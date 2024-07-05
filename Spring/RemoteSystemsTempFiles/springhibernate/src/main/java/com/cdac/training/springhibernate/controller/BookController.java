package com.cdac.training.springhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cdac.training.springhibernate.model.Book;
import com.cdac.training.springhibernate.service.BookService;

@Controller
public class BookController {
	
	@Autowired
    private BookService bookService;

    @GetMapping("/book")
    public String showBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "bookForm";
    }

    @PostMapping("/book")
    public String saveBook(@ModelAttribute("book") Book book) {
        bookService.saveBook(book);
        return "redirect:/books";
    }

    @GetMapping("/books")
    public String listBooks(Model model) {
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books", books);
        return "books";
    }

}
