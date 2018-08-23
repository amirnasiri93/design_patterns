package factory_method;

public class Main {

	public static void main(String[] args) {
		DevelopmentManager dev = new DevelopmentManager();
		dev.takeInterview();

		MarketingManager mgr = new MarketingManager();
		mgr.takeInterview();
	}

}
