package creational.factory_method;

public class DevelopmentManager extends HiringManager {

	@Override
	public Interviewer makeInterview() {
		return new Developer();
	}

}
