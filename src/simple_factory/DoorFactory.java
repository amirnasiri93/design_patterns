package simple_factory;

class DoorFactory {

	public static WoodenDoor makeDoor(float width, float height) {
		return new WoodenDoor(height, width);
	}
}
