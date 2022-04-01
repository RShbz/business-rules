package com.example.library.rules;

public class BookLoanDesicion {

	private final boolean desicion;
	private final String message;
	private final Integer duration;

	
	public BookLoanDesicion(boolean desicion, String message, Integer duration) {
		this.desicion = desicion;
		this.message = message;
		this.duration = duration;
	}
	/**
	 * @return the desicion
	 */
	public boolean isDesicion() {
		return desicion;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @return the duration
	 */
	public int getduration() {
		return duration;
	}
	
	
}
