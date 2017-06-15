import java.awt.image.BufferedImage;

public class SteelRim extends Options{

	public SteelRim(Car c){
		super(c);
	}
	@Override
	public BufferedImage display() {
		// TODO Auto-generated method stub
		return c.display();
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return c.cost()+5000;
	}

	@Override
	public String properties() {
		// TODO Auto-generated method stub
		return c.properties()+" with Steel Rim";
	}

}
