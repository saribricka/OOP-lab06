package it.unibo.oop.lab.exception2;

import java.util.Arrays;

public class WrongAccountHolderException extends IllegalStateException {

	private final int userID;
	
	public WrongAccountHolderException(int userID) {
		this.userID = userID;
	}

	@Override
	public String toString() {
		return "WrongAccountHolderException [userID = " + userID + "]";
	}
	
	public String getMessage() {
		return this.toString();
	}
	
}
