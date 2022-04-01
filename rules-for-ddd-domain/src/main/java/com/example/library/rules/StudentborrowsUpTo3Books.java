package com.example.library.rules;

import com.example.library.domain.user.Status;
import com.example.library.domain.user.User;
import com.example.library.domain.user.book.Book;

public class StudentborrowsUpTo3Books implements BookBorrowingRules{

	@Override
	public BookLoanDesicion run(Book book, User user) {
			if(user.getStatus()!=Status.STUDENT) throw new IllegalStateException("Error Access");
			if(user.getBookBorrowcount()==3) {return new BookLoanDesicion(false, "Kitap alma hakkınız bitti",null);}
		   
		return new BookLoanDesicion(true, "Yeni kitap alabilirsiniz, limitiniz dolmadı  ",3); //3 :weeks
	}

	
}
