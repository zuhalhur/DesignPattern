
public class Engine_1600 implements Engine{

	public String setMotor(){
		return "1.6";
	}

	@Override
	public String accelerate() {
		return "6 m/s^2";
	}

	@Override
	public String brake() {
		return "5 m/s^2";
	}
}
