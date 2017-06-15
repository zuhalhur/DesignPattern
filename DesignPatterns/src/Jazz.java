import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Jazz extends Car {

	public Jazz(Engine motor) {
		super(motor);
		model = "Jazz";
		maxSpeed = 160;
	}
	
	public BufferedImage display() {
		BufferedImage image = null;
		try{
			File imageFile = new File("honda.jpg");
			image = ImageIO.read(imageFile);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return image;
	}
	
	

	/*@Override
	public String setMotor() {
		return "The volume of motor is: "+motor.setMotor();
	}
*/
	@Override
	public double cost() {
		return 50000.00;
	}

	@Override
	public String properties() {
		return "Jazz";
	}
	
	

}
