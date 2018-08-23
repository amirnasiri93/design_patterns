package abstract_factory;

public class Carpenter implements DoorFittingExpert {

	@Override
	public void getDescription() {
		System.out.println("I'm a carpenter, I can only fit wooden doors.");

	}

}
