package com.example.library.application;

import java.util.ArrayList;
import java.util.List;

import com.example.library.domain.user.User;
import com.example.library.domain.user.book.Book;
import com.example.library.rules.BookBorrowingRules;
import com.example.library.rules.BookLoanDesicion;

public class UserApplication {

	public List<BookBorrowingRules> bookBorrowingRule;

	public List<BookLoanDesicion> borrowingABook(Book book, User user) {
		var desicions = new ArrayList<BookLoanDesicion>();
		for (var rule : bookBorrowingRule) {
			var result = rule.run(book, user);
			desicions.add(result);
		}

		return desicions;
	}
}
