import java.awt.image.BufferedImage;

public abstract class Options extends Car{
	Car c;
	public Options(Car c){
		super(c.motor);
		this.c = c;
	}
	public abstract BufferedImage display();
	
}
