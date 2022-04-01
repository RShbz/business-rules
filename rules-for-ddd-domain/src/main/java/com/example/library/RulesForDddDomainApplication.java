package com.example.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.library.application.UserApplication;
import com.example.library.domain.user.Status;
import com.example.library.domain.user.User;
import com.example.library.domain.user.book.Book;
import com.example.library.rules.StudentborrowsUpTo3Books;

@SpringBootApplication
public class RulesForDddDomainApplication {

	public static void main(String[] args) {
		SpringApplication.run(RulesForDddDomainApplication.class, args);
	
		var user1= new User.Builder()
				.Status(Status.STUDENT)
				.bookBorrowCount(1)
				.identityNo("111")
				.fullName("Remzi ŞAHBAZ")
				.phone("05307718154")
				.build();
		var book1 = new Book();
		
		var userApplication= new UserApplication()
									.bookBorrowingRule.add(StudentborrowsUpTo3Books.class)
									.borrowingABook(book1, user1);
		
		System.out.println(userApplication);
	}

}
