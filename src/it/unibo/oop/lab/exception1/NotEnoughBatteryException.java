package it.unibo.oop.lab.exception1;

public class NotEnoughBatteryException extends IllegalStateException {

	private double batteryLevel;
	private double mdc;

	
	public NotEnoughBatteryException(double batteryLevel, double movement_delta_consumption) {
		super();
		this.mdc = movement_delta_consumption;
	}

	@Override
	public String toString() {
		return "NotEnoughBatteryException [batteryLevel=" + batteryLevel + "]";
	}

	public String getMessage() {
		return this.toString();
	}

	public double getBatteryLevel() {
		return this.batteryLevel;
	}
	
	
	
	
	
}
