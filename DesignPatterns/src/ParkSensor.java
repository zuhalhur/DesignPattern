import java.awt.image.BufferedImage;

public class ParkSensor extends Options{

	
	
	public ParkSensor(Car car){
		super(car);
	}
	@Override
	public BufferedImage display() {
		// TODO Auto-generated method stub
		return c.display();
	}


	@Override
	public double cost() {
		return c.cost()+2500;
	}
	@Override
	public String properties() {
		return c.properties()+" with Park Sensor";
	}
	

}
