package abstract_factory;

public class WoodenDoorFactory implements DoorFactory {

	@Override
	public Door makeDoor() {
		return new WoodenDoor();
	}

	@Override
	public DoorFittingExpert getFittingExpert() {
		return new Carpenter();
	}

}
