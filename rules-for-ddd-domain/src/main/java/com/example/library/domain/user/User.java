package com.example.library.domain.user;

public  class User {

	private String identityNo;
	private String fullName;
	private String phone;
	private Status status;
	private int bookBorrowCount;
	

	public User(Builder builder) {
		this(builder.identityNo, builder.fullName, builder.phone, 
				builder.status, builder.bookBorrowCount);
	}
	
	private User(String identityNo, String fullName, String phone, Status status, int bookBorrowCount) {
		this.identityNo = identityNo;
		this.fullName = fullName;
		this.phone = phone;
		this.status = status;
		this.bookBorrowCount = bookBorrowCount;
	}

	/**
	 * @return the bookBorrowcount
	 */
	public int getBookBorrowcount() {
		return bookBorrowCount;
	}

	/**
	 * @return the identityNo
	 */
	public String getIdentityNo() {
		return identityNo;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */



	public static class Builder {
		
		private int bookBorrowCount;
		private String identityNo;
		private String fullName;
		private String phone;
		private Status status;
		
		public Builder identityNo(String identityNo) {
		this.identityNo=identityNo;
		return this;
		}
		public Builder fullName(String fullName) {
			this.fullName=fullName;
			return this;
		}
		public Builder phone(String phone) {
			this.phone=phone;
			return this;
		}
		public Builder Status(Status status) {
			this.status=status;
			return this;
		}
		public Builder bookBorrowCount(int bookBorrowCount) {
			this.bookBorrowCount=bookBorrowCount;
			return this;
		}
		
		public User build() {
			
			return new User(this);
		}
		
	}

}
