import java.awt.Image;
import java.awt.image.BufferedImage;

public abstract class Car {
	protected String model = "Unknown Model";
	protected int maxSpeed = 0;
	Engine motor;
	
	public Car(Engine engine){
		motor = engine;
	}

	public String setMotor(){
		return motor.setMotor();
	}

	public String accelerate() {
		return motor.accelerate();
	}

	public String brake() {
		return motor.brake();
	}

	public abstract BufferedImage display();

	public abstract double cost();
	
	public abstract String properties();

}
