package chapter4ObjectOrientation;

public class Car {
	public String color;
	public String model;
	public double maxSpeed;
	public double actualSpeed;
	public boolean started;
	
	public boolean start() {
		System.out.println("Car has started");
		this.started = true;
		return this.started;
	}
}
