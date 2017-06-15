import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Auris extends Car {

	

	public Auris(Engine motor) {
		super(motor);
		model = "Auris";
		maxSpeed = 180;
	}

	public BufferedImage display() {
		BufferedImage image = null;
		try{
			File imageFile = new File("toyota.jpg");
			image = ImageIO.read(imageFile);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return image;
	}
	
	
	
	/*public String setMotor(){
		return "The volume of motor is: "+motor.setMotor();
	}*/

	@Override
	public double cost() {
		return 75000.00;
	}

	@Override
	public String properties() {
		return "Auris";
	}
	
	
}
