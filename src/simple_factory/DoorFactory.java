package simple_factory;

public class DoorFactory {

	public static WoodenDoor makeDoor(float width, float height) {
		return new WoodenDoor(height, width);
	}
}
