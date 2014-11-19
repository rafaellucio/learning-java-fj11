import static org.junit.Assert.*;
import org.junit.Test;
import chapter4ObjectOrientation.Car;

public class TestCar {
	@Test
	public void shouldStartCar() {
		Car car = new Car();
		car.start();
		assertTrue(car.started);
	}
	
	@Test
	public void shouldAccelerateCar() {
		Car car = new Car();
	}
}
