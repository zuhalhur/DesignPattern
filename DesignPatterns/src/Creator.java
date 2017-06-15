
public class Creator {

	String engine;
	String car;
	
	public Creator(String engine,String car){
		this.engine = engine;
		this.car = car;
	}
	
	private Engine getMotor(){
		switch(engine){
		case("1400"):
			return new Engine_1400();
		case("1600"):
			return new Engine_1600();
		case("1800"):
			return new Engine_1800();
		default:
			return null;
		}
	}
	
	public Car getCar(){
		switch(car){
		case("Auris"):
			return new Auris(getMotor());
		case("Jazz"):
			return new Jazz(getMotor());
		case("Mercedes"):
			return new Mercedes(getMotor());
		default:
			return null;
		}
	}
}
