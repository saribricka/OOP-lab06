package it.unibo.oop.lab.exception2;

public class NotEnoughFoundsException extends IllegalStateException {

	private double amount;
	
	public NotEnoughFoundsException(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "NotEnoughFoundsException [amount=" + amount + "]";
	}
	
	public String getMessage() {
		return this.toString();
	}
	
}
