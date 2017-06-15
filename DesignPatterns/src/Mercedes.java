import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Mercedes extends Car{
	
	 public Mercedes(Engine motor) {
		    super(motor);
			model = "Mercedes";
			maxSpeed = 220;
	}
/*
	@Override
	public String setMotor() {
		return "The volume of motor is: "+motor.setMotor();
	}*/

	@Override
	public BufferedImage display() {
		BufferedImage image = null;
		try{
			File imageFile = new File("mercedes.jpg");
			image = ImageIO.read(imageFile);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return image;
	}

	@Override
	public double cost() {
		
		return 150000.00;
	}

	@Override
	public String properties() {
		return "Mercedes";
	}

}
