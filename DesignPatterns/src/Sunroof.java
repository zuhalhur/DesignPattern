import java.awt.image.BufferedImage;

public class Sunroof extends Options{

	
	public Sunroof(Car c){
		super(c);
	}
	@Override
	public BufferedImage display() {
	
		return c.display();
	}


	@Override
	public double cost() {
		return c.cost()+10000;
	}
	@Override
	public String properties() {
		return c.properties()+" with Sunroof";
	}

}
