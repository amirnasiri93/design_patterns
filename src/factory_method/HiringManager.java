package factory_method;

public abstract class HiringManager {
	/**
	 * this is the factory method, it returns a different type of class depending on
	 * the object.
	 * 
	 * @return
	 */
	public abstract Interviewer makeInterview();

	public void takeInterview() {
		Interviewer a = makeInterview();
		a.askQuestion();
	}
}
