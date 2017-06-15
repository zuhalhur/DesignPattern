
public class Engine_1800 implements Engine {
	
	public String setMotor(){
		return "1.8";
	}

	@Override
	public String accelerate() {
		return "8 m/s^2";
	}

	@Override
	public String brake() {
		return "6 m/s^2";
	}

}
