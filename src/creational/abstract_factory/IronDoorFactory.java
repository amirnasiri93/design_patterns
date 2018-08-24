package creational.abstract_factory;

public class IronDoorFactory implements DoorFactory {

	@Override
	public Door makeDoor() {
		return new IronDoor();
	}

	@Override
	public DoorFittingExpert getFittingExpert() {
		// TODO Auto-generated method stub
		return new Welder();
	}

}
