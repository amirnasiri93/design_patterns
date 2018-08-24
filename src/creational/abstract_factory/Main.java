package creational.abstract_factory;

public class Main {

	public static void main(String[] args) {

		DoorFactory wooden = new WoodenDoorFactory();
		wooden.makeDoor().getDescription();
		wooden.getFittingExpert().getDescription();
		DoorFactory iron = new IronDoorFactory();
		iron.makeDoor().getDescription();
		iron.getFittingExpert().getDescription();

	}

}
