package abstract_factory;

public class Welder implements DoorFittingExpert {

	@Override
	public void getDescription() {
		System.out.println("I'm a welder, I can only fit Iron doors.");

	}

}
