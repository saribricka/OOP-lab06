package it.unibo.oop.lab.exception2;

public class TransactionsOVerQuotaException extends Exception {
	
	public TransactionsOVerQuotaException() {
		super();
	}

	@Override
	public String toString() {
		return "TransactionsOVerQuotaException []";
	}

	public String getMessage() {
		return this.toString();
	}
}
