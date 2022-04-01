package com.example.library.rules;



import com.example.library.domain.user.User;
import com.example.library.domain.user.book.Book;

public interface BookBorrowingRules {

	BookLoanDesicion run (Book book,User user);
	
}
